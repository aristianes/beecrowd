package com.example.beecrowd;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;
        System.out.println("SOMA = " + soma);
    }
}
