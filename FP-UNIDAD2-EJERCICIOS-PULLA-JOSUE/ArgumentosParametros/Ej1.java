//Sesion: S10 - Argumentos y parametros: paso por valor
//Ejercicio 01: intercambiar(int a, int b)
//Enunciado: Implementar un metodo que intente intercambiar dos enteros primitivos y responder en un comentario si funciona y por qué.
//Autor: Pulla Josue
//Fecha: 17/11/2026

public class Ej1 {

    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del metodo -> a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 25;

        System.out.println("Antes de llamar al metodo -> x: " + x + ", y: " + y);
        intercambiar(x, y);
        System.out.println("Despues de llamar al metodo -> x: " + x + ", y: " + y);
    }
}

//ANALISIS:
// ¿Funciona? No, el intercambio no tiene efecto sobre las variables originales x e y en el main.
// ¿Por que? En Java, todos los argumentos se pasan por valor. Al pasar tipos primitivos (int),
// se envia una copia exacta del valor almacenado en 'x' y 'y' hacia los parametros 'a' y 'b'.
// al finalizar el metodo, las copias se destruyen y 'x' e 'y' conservan sus valores originales.