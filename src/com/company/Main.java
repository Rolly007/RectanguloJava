package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion, b, a;

        System.out.println("Ingrese la base del Rectangulo!");
        Scanner leerBase = new Scanner(System.in);
        String base = leerBase.nextLine();
        b = Integer.parseInt(base);

        System.out.println("Ingrese la altura del Rectangulo!");
        Scanner leerAltura = new Scanner(System.in);
        String altura = leerBase.nextLine();
        a = Integer.parseInt(altura);

        Rectangulo rect = new Rectangulo(b, a);


        System.out.println("0. Salir");
        System.out.println("1. Calcular el perimetro de un rectangulo");
        System.out.println("2. Calcular el Area de un rectangulo");

        Scanner scanner = new Scanner(System.in);
        String valor = scanner.nextLine();
        opcion = Integer.parseInt(valor);

        switch (opcion) {
            case 1:
                System.out.println("El perimetro del rectangulo es: " + rect.calcularPerimetro());
                break;
            case 2:
                System.out.println("El area del rectangulo es: " + rect.calcularArea());
                break;
            default:
                break;

        }
    }
}
