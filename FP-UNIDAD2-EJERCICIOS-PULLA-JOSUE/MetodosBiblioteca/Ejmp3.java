
//Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
//Ejercicio 03: Validar una contraseña
//Enunciado: Validar que una contraseña tenga mínimo 8 caracteres, al menos una mayúscula y al menos un dígito usando Character.
//Autor: Pulla Josue
//Fecha: 17/11/2026

import java.util.Scanner;

public class Ejmp3 {

    public static boolean esContrasenaValida(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneDigito = true;
            }
        }

        return tieneMayuscula && tieneDigito;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una contraseña para validar: ");
        String pwd = sc.nextLine();

        if (esContrasenaValida(pwd)) {
            System.out.println("Contraseña VÁLIDA: cumple con todos los requisitos.");
        } else {
            System.out.println("Contraseña INVÁLIDA: debe tener al menos 8 caracteres, una mayúscula y un dígito.");
        }

        sc.close();
    }
}