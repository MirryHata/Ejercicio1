package com.salazar;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int opcion;
        Scanner lector = new Scanner(System.in);
        System.out.println("<><><><><><><><><><><><><><><><><>");
        System.out.println("Bienvenido a la calculadora UNICAH!");
        System.out.println("<><><><><><><><><><><><><><><><><>");

        do {
            System.out.println("1. Elevar un numero");
            System.out.println("2. Calcular raiz cuadrada");
            System.out.println("3. Determinar si un numero es primo");
            System.out.println("4. Salir");
            opcion = lector.nextInt();
            switch(opcion) {
                case 1:
                    Matematicas operacion1 = new Matematicas(1);
                    System.out.println("El resultado es : " + operacion1.elevar());
                    System.out.println("---------------------------------------");
                    break;
                case 2:
                    Matematicas operacion2 = new Matematicas(1);
                    System.out.println("El resultado es :" + operacion2.raiz());
                    System.out.println("-----------------------------------------");
                    break;
                case 3:
                    Matematicas operacion3 = new Matematicas(1);
                    System.out.println(operacion3.numPrimo());
                    System.out.println("---------------------------------------------");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("La opción que ingresó no es válida.");
            }
        } while(opcion != 4);

    }
}
