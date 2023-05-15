package com.example.beecrowd;

import java.util.Scanner;

public class MaiorO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        if(valor1 > valor2 && valor1 > valor3){
            System.out.println(valor1 + " eh o maior");
        }else if (valor2 > valor3){
            System.out.println(valor2 + " eh o maior");
        }else {
            System.out.println(valor3 + " eh o maior");
        }
    }


}
