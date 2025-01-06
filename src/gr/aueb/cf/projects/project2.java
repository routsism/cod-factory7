package gr.aueb.cf.projects;

public class project2 {

    public static class MaxSumSubarray {

        public static int maxSubArraySum(int[] arr) {

            if (arr.length == 0) return 0;


            int localMax = arr[0];
            int globalMax = arr[0];


            for (int i = 1; i < arr.length; i++) {
                // Το τοπικό μέγιστο για την τρέχουσα θέση
                localMax = Math.max(arr[i], localMax + arr[i]);


                if (localMax > globalMax) {
                    globalMax = localMax;
                }
            }


            return globalMax;
        }

        public static void main(String[] args) {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

            int maxSum = maxSubArraySum(arr);

            System.out.println("Το μέγιστο άθροισμα του συνεχόμενου υποπίνακα είναι: " + maxSum);
        }
    }
}
