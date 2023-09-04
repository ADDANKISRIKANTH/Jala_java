package org.example.Loops;

public class ArmStrongNumber {

    public static void checkArmstrongNum(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        checkArmstrongNum(121);
    }
}
