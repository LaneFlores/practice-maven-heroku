package com.practice.heroku.util;

public class PracticeUtilityClass {
    public static int max(int x, int y) {
        // We're going to have some tests on this function, which expect it to return the higher of the two numbers.
        // HOWEVER, to test our continuous integration, we're going to break it.

        return x; // This line breaks it.
        //return Math.max(x, y); // This line fixes it. :)
    }
}
