package com.stackroute.pe3;

public class VowelsRemover {        //Removes vowels in Word

    public static String[] vowels(String[] locations) {
        String[] array;
        if (locations == null) {
            return null;
        }   String words[] = new String[locations.length];
        int i = 0;
        for (String location : locations) {
            if (location == null) {
                words[i++] = null;
            } else {
                words[i++] = location.replaceAll("[aeiou]", "");
                System.out.println(location);
            }
        }

            return words;
    }
}