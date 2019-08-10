package com.salazar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lector {
    public Lector() {
    }

    public static double solicitarInt(String mensaje) {
        Scanner Lector = new Scanner(System.in);
        System.out.println(mensaje);
        try {
            double num1 = Lector.nextInt();
            return num1;
        }catch(InputMismatchException var4){
            System.out.println("El dato que ingresó no es válido.");
            return solicitarInt(mensaje);
        }
    }
}

