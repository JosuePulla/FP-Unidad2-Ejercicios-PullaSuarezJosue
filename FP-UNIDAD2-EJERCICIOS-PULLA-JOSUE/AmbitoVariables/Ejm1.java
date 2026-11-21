package AmbitoVariables;

/*
- Sesión: S11 - Ámbito de las variables
- Ejercicio 01: Marcar ámbitos
- Enunciado: Programa con un comentario en cada variable indicando si es local, de bloque o static.
- Autor: Pulla Josue
- Fecha: 17/11/2026
 */
public class Ejm1 {

    // Variable static (ámbito de clase: vive durante toda la ejecución del programa)
    static int contadorGlobal = 0;

    // Variable static (ámbito de clase: constante accesible en todos los métodos estáticos)
    static final double TASA_IVA = 0.15;

    public static void calcularTotal(double subtotal) { // 'subtotal': variable local (parámetro del método)
        // Variable local (ámbito de método: solo existe dentro de calcularTotal)
        double impuesto = subtotal * TASA_IVA;
        contadorGlobal++;

        if (subtotal > 100) {
            // Variable de bloque (solo existe dentro de las llaves de este bloque if)
            double descuentoEspecial = 10.0;
            double totalConDescuento = (subtotal + impuesto) - descuentoEspecial; // Variable de bloque
            System.out.println("Total con descuento: " + totalConDescuento);
        }

        for (int i = 0; i < 2; i++) { // 'i': variable de bloque (solo existe dentro del ciclo for)
            // Variable de bloque (se crea y destruye en cada iteración del for)
            String mensaje = "Iteración de verificación #" + (i + 1);
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) { // 'args': variable local (parámetro de main)
        // Variable local (solo existe dentro del método main)
        double compra = 150.0;
        calcularTotal(compra);
        System.out.println("Operaciones realizadas: " + contadorGlobal);
    }
}