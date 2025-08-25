package org.example;

public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters
    public static boolean shortString(String string) {
        if (string.length() < 5) {
            return true;
        } else {
            return false;
        }
    }

    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string
    public static char firstLetter(String string) {
        return string.charAt(0);
    }

    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"
    public static String censorAsparagus(String string) {
        return string.replaceAll("asparagus", "****");
    }

    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.
    public static String bigger(String string1, String string2) {
        if (string1.length() >= string2.length()) {
            return string1;
        } else {
            return string2;
        }
    }
}
