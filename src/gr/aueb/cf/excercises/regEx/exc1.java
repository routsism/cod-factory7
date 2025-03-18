package gr.aueb.cf.excercises.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exc1 {

    public static void main(String[] args) {

        String s = "aA1!werp";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*[A-Z])(?=.*?[0-9])(?=.*[#?!@%^&*$^-])^.{8,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
