package com.example;

public class Novela extends Libro {

    private String tipo; // histórica, romántica, policíaca, realista, ciencia ficción, aventuras

    public Novela(String titulo, String autor, int numeroEjemplares,
            int numeroEjemplaresPrestados, String tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Novela{" +
                "tipo='" + tipo + '\'' +
                "} " + super.toString();
    }
}