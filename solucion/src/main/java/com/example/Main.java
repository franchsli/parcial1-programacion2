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
        scanner.close();

    }
}