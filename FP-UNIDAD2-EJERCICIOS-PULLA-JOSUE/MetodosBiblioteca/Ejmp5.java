
//Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
//Ejercicio 05: Código de 6 caracteres
//Enunciado: Generar un código aleatorio de 6 caracteres compuesto por 3 letras mayúsculas aleatorias y 3 dígitos aleatorios.
//Autor: Pulla Josue
//Fecha: 17/11/2026

import java.util.Random;

public class Ejmp5 {

    public static String generarCodigo() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();

        // Generar 3 letras mayúsculas aleatorias ('A' = 65 hasta 'Z' = 90)
        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + random.nextInt(26));
            codigo.append(letra);
        }

        // Generar 3 dígitos aleatorios ('0' hasta '9')
        for (int i = 0; i < 3; i++) {
            int digito = random.nextInt(10);
            codigo.append(digito);
        }

        return codigo.toString();
    }

    public static void main(String[] args) {
        String codigoGenerado = generarCodigo();
        System.out.println("Código generado (3 letras + 3 dígitos): " + codigoGenerado);
    }
}