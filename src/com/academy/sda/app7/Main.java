package com.academy.sda.app7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Ju lutem Vendos nje numer pozitiv integer: ");
        int n = input.nextInt();
        int fibNumber = fibonacci(n);
        System.out.println(" " + n + "   Numri fibonacit eshte " + fibNumber);
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
