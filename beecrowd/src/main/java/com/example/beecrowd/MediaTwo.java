package com.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class MediaTwo {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        int somPeso = 10;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double media = ((a * 2) + (b * 3) + (c * 5)) / somPeso;
        System.out.println(String.format("MEDIA = %.1f", media));
    }

}
