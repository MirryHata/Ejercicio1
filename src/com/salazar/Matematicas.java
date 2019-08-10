package com.salazar;

import java.util.Scanner;

public class Matematicas {
    Scanner lector;
    double resultado;
    int i;
    int acumulador;

    public Matematicas(double resultado) {
        this.lector = new Scanner(System.in);
        this.resultado = resultado;
    }

    public double elevar() {
        double n1 = Lector.solicitarInt("Ingrese el numero que desea elevar:");
        double n2 = Lector.solicitarInt("Ingrese la potencia :");
        return this.resultado *=Math.pow(n1, n2);
    }

    public double raiz() {
        double n1 = Lector.solicitarInt("Ingrese el numero :");
        return this.resultado *= Math.sqrt(n1);
    }

    public double numPrimo() {
        double n1 = Lector.solicitarInt("Ingrese el numero que desea evaluar :");
        for(this.i = 1; this.i < n1 + 1; ++this.i) {
            if (n1 % this.i == 0) {
                ++this.acumulador;
            }
        }
        if (this.acumulador != 2) {
            System.out.println("El numero ingresado no es primo. :(");
        } else {
            System.out.println("El numero ingresado es primo. :)");
        }
        return n1;
    }
}

