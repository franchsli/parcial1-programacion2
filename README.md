# Parcial 1 Programación 2 411

Integrantes:

- VÍCTOR MANUEL PALACIOS GUTIÉRREZ.
- ALAN ADRIÁN LEDESMA SALAS.
- FRANCISCO DAVID ARBOLEDA QUIÑONES.

1.Construya el diagrama UML de clases del anterior ejercicio.

````mermaid
classDiagram
    class Libro {
        - String titulo
        - String autor
        - int numeroEjemplares
        - int numeroEjemplaresPrestados
        + Libro()
        + Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados)
        + getTitulo() String
        + setTitulo(String titulo) void
        + getAutor() String
        + setAutor(String autor) void
        + getNumeroEjemplares() int
        + setNumeroEjemplares(int numeroEjemplares) void
        + getNumeroEjemplaresPrestados() int
        + setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) void
        + prestamo() boolean
        + devolucion() boolean
        + toString() String
    }
 
    class LibroTexto {
        - String curso
        + LibroTexto()
        + LibroTexto(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso)
        + getCurso() String
        + setCurso(String curso) void
        + toString() String
    }
 
    class LibroTextoUNIAC {
        - String facultad
        + LibroTextoUNIAC()
        + LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso, String facultad)
        + getFacultad() String
        + setFacultad(String facultad) void
        + toString() String
    }
 
    class Novela {
        - String tipo
        + Novela()
        + Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String tipo)
        + getTipo() String
        + setTipo(String tipo) void
        + toString() String
    }
 
    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUNIAC
    Libro <|-- Novela
`