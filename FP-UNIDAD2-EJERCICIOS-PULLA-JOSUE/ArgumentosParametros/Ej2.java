
//Sesion: S10 - Argumentos y parametros: paso por valor
//Ejercicio 02: intercambiar(int[] v, int i, int j)
//Enunciado: Implementar un metodo que intercambie dos posiciones de un arreglo y explicar por qué ahora sí funciona.
//Autor: Pulla Josue
//Fecha: 17/11/2026

import java.util.Arrays;

public class Ej2 {

    public static void intercambiar(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public static void main(String[] args) {
        int[] numeros = {15, 30, 45, 60};

        System.out.println("Antes del intercambio: " + Arrays.toString(numeros));
        intercambiar(numeros, 0, 3);
        System.out.println("Despues del intercambio (indices 0 y 3): " + Arrays.toString(numeros));
    }
}

// ANALISIS:
// ¿Por que ahora si funciona?
// Aunque Java sigue pasando los argumentos por valor, en el caso de los arreglos (que son objetos),
// el valor que se copia hacia el parametro 'v' es la referencia
// donde reside el arreglo real. Tanto 'numeros' en main como 'v' en el metodo apuntan al mismo
// objeto en memoria. Por lo tanto, al modificar los elementos internos (v[i] y v[j]), los cambios
// se reflejan directamente en el arreglo original.

