package math;

import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number whose factorial  is to be found: ");
            int n = scanner.nextInt();
            int result = factorial(n);
            System.out.println("The factorial (using Iteration) of " + n + " is " + result);


         int result2 = factorialR(n);
         System.out.println("The factorial (using Recursion) of "+ n +" is " + result2);


        }

        public static int factorial(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
    }

    public static int factorialR(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialR(n - 1);
        }
    }
}
