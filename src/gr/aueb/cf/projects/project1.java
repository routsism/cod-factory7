package gr.aueb.cf.projects;

import java.io.*;
import java.util.*;

public class project1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("c:/input.txt"));
        List<Integer> numbers = new ArrayList<>();
        String line;


        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                numbers.add(Integer.parseInt(token));
            }
        }
        reader.close();


        Collections.sort(numbers);


        List<List<Integer>> validCombinations = new ArrayList<>();
        generateCombinations(numbers, new ArrayList<>(), validCombinations);


        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        for (List<Integer> combination : validCombinations) {
            writer.write(combination.toString().replaceAll("[\\[\\],]", "") + "\n");
        }
        writer.close();
    }


    public static void generateCombinations(List<Integer> numbers, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == 6) {

            if (isValidCombination(current)) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            current.add(numbers.get(i));
            generateCombinations(numbers.subList(i + 1, numbers.size()), current, result);
            current.remove(current.size() - 1);
        }
    }


    public static boolean isValidCombination(List<Integer> combination) {
        return !isEven(combination) &&
                !isOdd(combination) &&
                !isContiguous(combination) &&
                !isSameEnding(combination) &&
                !isSameTen(combination);
    }


    public static boolean isEven(List<Integer> combination) {
        long evenCount = combination.stream().filter(n -> n % 2 == 0).count();
        return evenCount > 4;
    }


    public static boolean isOdd(List<Integer> combination) {
        long oddCount = combination.stream().filter(n -> n % 2 != 0).count();
        return oddCount > 4;
    }


    public static boolean isContiguous(List<Integer> combination) {
        for (int i = 0; i < combination.size() - 1; i++) {
            if (combination.get(i) + 1 == combination.get(i + 1)) {
                return true;
            }
        }
        return false;
    }


    public static boolean isSameEnding(List<Integer> combination) {
        Map<Integer, Long> endings = new HashMap<>();
        for (int num : combination) {
            int lastDigit = num % 10;
            endings.put(lastDigit, endings.getOrDefault(lastDigit, 0L) + 1);
        }
        return endings.values().stream().anyMatch(count -> count > 3);
    }


    public static boolean isSameTen(List<Integer> combination) {
        Map<Integer, Long> tens = new HashMap<>();
        for (int num : combination) {
            int ten = (num - 1) / 10;
            tens.put(ten, tens.getOrDefault(ten, 0L) + 1);
        }
        return tens.values().stream().anyMatch(count -> count > 3);
    }
}

