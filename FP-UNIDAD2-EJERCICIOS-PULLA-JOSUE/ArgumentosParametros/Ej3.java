//Sesion: S10 - Argumentos y parametros: paso por valor
//Ejercicio 03: aplicarDescuento(double[] precios, double pct)
//Enunciado: Escribir un metodo que modifique un arreglo de precios aplicando un porcentaje de descuento e imprimir antes y después.
//Autor: Pulla Josue
//Fecha: 17/11/2026

public class Ej3 {

    public static void aplicarDescuento(double[] precios, double pct) {
        double factor = 1.0 - (pct / 100.0);
        for (int i = 0; i < precios.length; i++) {
            precios[i] = Math.round((precios[i] * factor) * 100.0) / 100.0;
        }
    }

    public static void imprimirArreglo(String etiqueta, double[] arreglo) {
        System.out.print(etiqueta + ": [");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("$%.2f", arreglo[i]);
            if (i < arreglo.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        double[] catalogo = {120.00, 45.50, 89.99, 250.00};
        double descuento = 15.0; // 15% de descuento

        imprimirArreglo("Precios originales", catalogo);
        aplicarDescuento(catalogo, descuento);
        imprimirArreglo("Precios con " + descuento + "% de descuento", catalogo);
    }
}