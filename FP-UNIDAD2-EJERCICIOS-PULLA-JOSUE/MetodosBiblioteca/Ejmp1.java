
//Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
//Ejercicio 01: Distancia entre dos puntos
//Enunciado: Calcular la distancia euclidiana entre dos puntos (x1, y1) y (x2, y2) usando Math.sqrt y Math.pow.
//Autor: Pulla Josue
//Fecha: 17/11/2026

import java.util.Scanner;

public class Ejmp1 {

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double deltaX = Math.pow(x2 - x1, 2);
        double deltaY = Math.pow(y2 - y1, 2);
        return Math.sqrt(deltaX + deltaY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Ingrese x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Ingrese y2: ");
        double y2 = sc.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.printf("La distancia entre (%.2f, %.2f) y (%.2f, %.2f) es: %.4f%n",
                x1, y1, x2, y2, distancia);

        sc.close();
    }
}