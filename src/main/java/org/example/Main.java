package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exercise 1: length() - Finding the String's Size
        String greeting = "Hello, Cadets!";
        int length = greeting.length();
        System.out.println("The length of the string is: " + length);
        // Prediction: The length of the string is: 14
        // Observation: The length of the string is: 14

        // Exercise 2: charAt() - Accessing a Character
        String message = "Keep learning!";
        char character = message.charAt(5);
        System.out.println("The character at index 5 is: " + character);
        // Prediction: The character at index 5 is: l
        // Observation: The character at index 5 is: l

        // Exercise 3: substring() - Extracting a Part of a String
        String statement = "Java is powerful.";
        String part = statement.substring(5, 7);
        System.out.println("The extracted substring is: " + part);
        // Prediction: The character at index 5 is: is
        // Observation: The character at index 5 is: is

        // Exercise 4: toUpperCase() and toLowerCase() - Changing Case
        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        /* Prediction:
        Uppercase: THIS IS A TEST
        LOWERCASE: this is a test
        Observation:
        Uppercase: THIS IS A TEST
        LOWERCASE: this is a test
        */

        // Exercise 5: indexOf() - Finding a Character or Substring
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox");
        int indexOfZ = sentence.indexOf('z');
        int indexOfCat = sentence.indexOf("cat");
        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println("Index of 'cat': " + indexOfCat);

        /* Prediction
        Index of 'fox': 16
        Index of 'z': 37
        Index of 'cat': -1

        Observation
        Index of 'fox': 16
        Index of 'z': 37
        Index of 'cat': -1

         */

        // Exercise 6: equals() vs. equalsIgnoreCase() - Comparing Strings
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);

        /* Prediction
        "Java".equals("java"): false
        "Java".equals("Java"): true
        "Java".equalsIgnoreCase("java"): true

        Observation
        "Java".equals("java"): false
        "Java".equals("Java"): true
        "Java".equalsIgnoreCase("java"): true
         */

        // Exercise 7: replace() - Replacing Characters
        String original = "I like cats. Cats are cute.";
        String replaced = original.replace("cats", "dogs");
        System.out.println("Original: " + original);
        System.out.println("Replaced: " + replaced);

        /*
        Observation
        Original: I like cats. Cats are cute.
        Replaced: I like gods. Cats are cute.

        Prediction
        Original: I like cats. Cats are cute.
        Replaced: I like dogs. Cats are cute.
         */

        // Exercise 8: trim() - Removing Whitespace
        String padded = "   Lots of spaces   ";
        String trimmed = padded.trim();
        System.out.println("Padded string length: " + padded.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Trimmed string length: " + trimmed.length());

        /*
        Observation
        Padded string length: 20
        Trimmed string: 'Lots of spaces'
        Trimmed string length: 14

        Prediction
        Padded string length: 20
        Trimmed string: 'Lots of spaces'
        Trimmed string length: 14
         */

    }
}