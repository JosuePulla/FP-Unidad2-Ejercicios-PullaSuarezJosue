//Sesion: S10 - Argumentos y parametros: paso por valor
//Ejercicio 05: Prediccion de salida
//Enunciado: Programa con 3 llamadas a metodos, incluyendo la salida predicha en un comentario y la verificación con la salida real.
//Autor: Pulla Josue
//Fecha: 17/11/2026

public class Ej5 {

    public static int modificarValor(int n) {
        n = n + 10;
        return n;
    }

    public static void modificarArreglo(int[] arr, int val) {
        arr[0] = arr[0] + val;
        val = 99;
    }

    public static void main(String[] args) {
        int a = 5;
        int[] datos = {10, 20};

        // Llamada 1
        int res = modificarValor(a);
        System.out.println("Llamada 1 -> a: " + a + ", res: " + res);

        // Llamada 2
        modificarArreglo(datos, a);
        System.out.println("Llamada 2 -> datos[0]: " + datos[0] + ", a: " + a);

        // Llamada 3
        a = modificarValor(datos[1]);
        System.out.println("Llamada 3 -> a: " + a + ", datos[1]: " + datos[1]);
    }
}


 //SALIDA PREDICHA:
 //Llamada 1 -> a: 5, res: 15
 //Llamada 2 -> datos[0]: 15, a: 5
 //Llamada 3 -> a: 30, datos[1]: 20

 //EXPLICACIoN Y SALIDA REAL:
 //En Llamada 1: 'a' pasa por valor (5), el metodo retorna 15 a 'res', pero 'a' sigue valiendo 5.
 //En Llamada 2: 'datos' pasa su referencia y modifica datos[0] (10 + 5 = 15); 'val' recibe una copia de 'a' y cambiarlo a 99 no afecta a 'a'.
 //En Llamada 3: datos[1] pasa su valor (20), retorna 30 y se asigna explicitamente a 'a', mientras datos[1] permanece en 20.
 //Salida real al ejecutar:
 //Llamada 1 -> a: 5, res: 15
 //Llamada 2 -> datos[0]: 15, a: 5
 //Llamada 3 -> a: 30, datos[1]: 20
 