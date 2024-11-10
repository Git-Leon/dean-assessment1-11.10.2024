package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.sql.Array;
import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input) {
        ArrayList<String> words = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (substring.equalsIgnoreCase(BasicStringUtils.reverse(substring))) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
