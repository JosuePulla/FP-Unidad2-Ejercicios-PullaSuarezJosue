//Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
//Ejercicio 02: Dados que suman 7
//Enunciado: Simular 1000 lanzamientos de dos dados usando Random, mostrando el conteo y porcentaje de veces que suman 7.
//Autor: Pulla Josue
//Fecha: 17/11/2026

import java.util.Random;

public class Ejmp2 {

    public static void main(String[] args) {
        Random random = new Random();
        int totalLanzamientos = 1000;
        int conteoSuma7 = 0;

        for (int i = 0; i < totalLanzamientos; i++) {
            int dado1 = random.nextInt(6) + 1; // Número entre 1 y 6
            int dado2 = random.nextInt(6) + 1; // Número entre 1 y 6

            if (dado1 + dado2 == 7) {
                conteoSuma7++;
            }
        }

        double porcentaje = (conteoSuma7 * 100.0) / totalLanzamientos;

        System.out.println("Total de lanzamientos: " + totalLanzamientos);
        System.out.println("Veces que la suma fue 7: " + conteoSuma7);
        System.out.printf("Porcentaje obtenido: %.2f%%%n", porcentaje);
    }
}