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
 Dentro de su código identifique 2 situaciones en las que no se podría realizar la herencia. (por ejemplo: modificadores de acceso, clases finales, entre otras).

R//Uso del modificador final en la clase base:
public final class Libro {
    // Atributos y métodos
}

Falla / Explicación: La palabra clave final impide explícitamente que una clase sea extendida por otra. Si la clase Libro se declara como final, las subclases como LibroTexto o Novela generarán un error de compilación (cannot inherit from final Libro).

Constructor privado o sin visibilidad de superclase disponible:

R// public class Libro {
    private Libro() {
        // Constructor privado
    }
}

Falla / Explicación: Al declarar un único constructor con visibilidad private en la clase Libro, las subclases (LibroTexto, Novela) no podrán invocar explícita ni implícitamente a super(). Como resultado, el compilador emitirá un error indicando que Libro() tiene acceso privado en Libro.
