package com.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        int diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca);

    }
}
