package com.string.pack;

public class PrimeNumber2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 3, 4, 5},
            {6, 7, 8, 9},
            {10, 11, 12, 13},
            {14, 15, 16, 17}
        };

        System.out.println("Prime numbers in the 2D array:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isPrime(matrix[i][j])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
