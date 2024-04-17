package Repaso;

import java.util.Scanner;

public class SumaEnterosPorTeclado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa en java para sumar dos numeros enteros ingresados por teclado");
        System.out.println("Ingrese el primer numero");
        int n1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int n2 = scanner.nextInt();

        int resSuma = n1 + n2;
        System.out.println("El resultado de la suma es:" +  resSuma);
    }

}
