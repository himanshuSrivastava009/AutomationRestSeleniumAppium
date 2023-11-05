package com.prog;

public class StringContainment {
    public static void main(String[] args) {
        String X = "test";
        String Y = "test";

        String result = isContained(X, Y);

        System.out.println(result);
    }

    public static String isContained(String X, String Y) {
        if (X == null || Y == null) {
            return "No"; // Handle null input
        }

        int xLength = X.length();
        int yLength = Y.length();

        for (int i = 0; i <= xLength - yLength; i++) {
            int j;
            for (j = 0; j < yLength; j++) {
                if (X.charAt(i + j) != Y.charAt(j)) {
                    break;
                }
            }
            if (j == yLength) {
                return "Yes"; // Y is contained in X
            }
        }

        return "No"; // Y is not contained in X
    }
}
