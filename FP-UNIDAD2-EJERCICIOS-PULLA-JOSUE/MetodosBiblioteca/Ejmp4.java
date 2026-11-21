//Sesión: S12 - Métodos de biblioteca: Math, Random, Character y Stringz
//  Ejercicio 04: Contar vocales
//Enunciado: Contar vocales mayúsculas y minúsculas de una cadena utilizando métodos de String y Character.
//Autor: Pulla Josue
//Fecha: 17/11/2026

import java.util.Scanner;

public class Ejmp4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase o palabra: ");
        String texto = sc.nextLine();

        int mayusculas = 0;
        int minusculas = 0;
        String vocalesReferencia = "aeiouáéíóú";

        for (int i = 0; i < texto.length(); i++) {
            char actual = texto.charAt(i);
            char enMinuscula = Character.toLowerCase(actual);

            if (vocalesReferencia.indexOf(enMinuscula) != -1) {
                if (Character.isUpperCase(actual)) {
                    mayusculas++;
                } else {
                    minusculas++;
                }
            }
        }

        System.out.println("Vocales mayúsculas: " + mayusculas);
        System.out.println("Vocales minúsculas: " + minusculas);
        System.out.println("Total de vocales: " + (mayusculas + minusculas));

        sc.close();
    }
}