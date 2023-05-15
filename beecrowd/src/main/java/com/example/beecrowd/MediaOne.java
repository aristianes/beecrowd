package com.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class MediaOne {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double media = ((3.5 * a) + (7.5 * b)) /11;
        System.out.println(String.format("MEDIA = %.5f" , media));

        

    }
}
