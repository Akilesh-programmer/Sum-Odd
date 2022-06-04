package com.akilesh;

public class SumOdd {

    // Method to check odd number.
    public static boolean isOdd(int number) {
        // Validating number.
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    // Method to sum
    public static int sumOdd(int start, int end) {
        // Validating parameters.
        if ((!(end >= start)) || (!(start > 0)) || (!(end > 0))) {
            return -1;
        }

        int sum = 0;
        end++;
        for (int i = start; i < end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
