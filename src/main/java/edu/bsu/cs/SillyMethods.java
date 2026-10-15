package edu.bsu.cs;

public class SillyMethods {

    public boolean didGuess42(int guess) {
        return guess == 42;
    }

    public String countTo(int number) {
        String result = "";

        for (int i = 0; i <= number; i++) {
            if (i > 0) {
                result += " ";
            }
            result += i;
        }

        return result;
    }
}