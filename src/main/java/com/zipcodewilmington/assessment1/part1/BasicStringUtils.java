package com.zipcodewilmington.assessment1.part1;


/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String answer = str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
        return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
             result.append(str.charAt(i));
        }
        return result.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String result;
        result = camelCase(reverse(str));
        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= str.length()-1; i++) {
            char currentChar = str.charAt(i);
            if(Character.isUpperCase(currentChar)){
                result.append(Character.toLowerCase(currentChar));
            }
            else{
                result.append(Character.toUpperCase(currentChar));
            }
        }
        return result.toString();
    }
}
