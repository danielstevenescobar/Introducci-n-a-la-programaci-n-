package com.ejemploTema1;

public class EjercicioTema1 {

    public static void main(String[] args) {

        // enteros
        Byte  numero1= 3; // 1 byte
        short numero2 = 15; // 2 bytes
        int numero3 = 45; // 4 bytes
        long numero4 = 90; // 8 bytes.

        System.out.println("Variables enteros:" + numero1 + "," + numero2 + "," + numero3 + "," + numero4);

        // decimales
        float decimal5 = 6.3f;
        double decimal6 = 11.5;

        System.out.println("Decimales:" + decimal5 + " , " + decimal6);

        // cadena texto
        String nombre = "Jose David";
        String apellido = "Prieto";

        System.out.println("Cadena de texto:" + nombre + "  " + apellido);

        // caracter
        //char caracter7 = "a";

        System.out.println("Caracter7:" + "char: a ");

        //booleanos
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("Booleanos:" + "verdadero o " + "falso");
    }
}
