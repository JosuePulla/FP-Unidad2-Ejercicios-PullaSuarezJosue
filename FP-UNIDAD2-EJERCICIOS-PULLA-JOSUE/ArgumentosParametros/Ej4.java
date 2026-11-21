
//Sesion: S10 - Argumentos y parametros: paso por valor
//Ejercicio 04: Sobrecarga de perimetro
//Enunciado: Implementar dos versiones sobrecargadas del metodo perimetro (cuadrado y rectangulo) y llamarlas desde main.
//Autor: Pulla Josue
//Fecha: 17/11/2026

public class Ej4 {

    // Version 1: Perimetro de un cuadrado (1 parametro)
    public static double perimetro(double lado) {
        return 4 * lado;
    }

    // Version 2: Perimetro de un rectangulo (2 parametros)
    public static double perimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        double ladoCuadrado = 6.5;
        double baseRect = 8.0;
        double alturaRect = 4.5;

        System.out.println("Perimetro del cuadrado (lado " + ladoCuadrado + "): " + perimetro(ladoCuadrado));
        System.out.println("Perimetro del rectangulo (" + baseRect + " x " + alturaRect + "): " + perimetro(baseRect, alturaRect));
    }
}