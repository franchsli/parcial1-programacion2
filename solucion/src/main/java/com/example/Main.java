package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // constructor con parámetros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);
        System.out.println(libro1);

        // constructor por defecto
        Libro libro2 = new Libro();
        System.out.println("Ingrese título del libro 2:");
        libro2.setTitulo(scanner.nextLine());
        System.out.println("Ingrese autor del libro 2:");
        libro2.setAutor(scanner.nextLine());
        System.out.println("Ingrese número de ejemplares del libro 2:");
        libro2.setNumeroEjemplares(Integer.parseInt(scanner.nextLine()));
        System.out.println("Ingrese número de ejemplares prestados del libro 2:");
        libro2.setNumeroEjemplaresPrestados(Integer.parseInt(scanner.nextLine()));
        System.out.println(libro2);

        // libro de facultad
        LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
                "Fundamentos de Programación", "Luis Joyanes Aguilar",
                10, 3, "Programación II", "Facultad de Ingeniería");
        System.out.println(libroTextoUNIAC);


        // novela
        Novela novela = new Novela("María", "Jorge Isaacs", 4, 0, "Romántica");
        System.out.println(novela);

        // Pruebas de préstamo y devolución
        System.out.println("\n--- Pruebas préstamo y devolución ---");
 
        System.out.println("Préstamo libro1: " + libro1.prestamo());
        System.out.println(libro1);
 
        System.out.println("Devolución libro1: " + libro1.devolucion());
        System.out.println(libro1);
 
        System.out.println("Préstamo libroTextoUNIAC: " + libroTextoUNIAC.prestamo());
        System.out.println(libroTextoUNIAC);
 
        // Caso que debe dar (false): devolver una novela que no se ha prestado
        System.out.println("Devolución novela (sin haber sido prestada): " + novela.devolucion());

        scanner.close();

    }
}