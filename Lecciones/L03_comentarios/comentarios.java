package Lecciones.L03_comentarios;

/**
 * Esta lección muestra cómo y cuándo usar cada tipo de comentario.
 */

public class comentarios {
    public static void main(String[] args) {

            // Comentario de una sola línea:
            // Se usa para notas breves o para comentar una línea de código.
            System.out.println("Hola, este es un comentario de una sola línea.");

            /*
             * Comentario multilínea o de bloque:
             * Ideal para explicar secciones de código más complejas,
             * instrucciones largas o para desactivar temporalmente
             * fragmentos de código durante pruebas.
             */
            System.out.println("Hola, este es un comentario multilínea.");

            /**
             * Comentario JavaDoc:
             * Sirve para documentar el código y se utiliza
             * para generar documentación automática en HTML.
             * Normalmente se coloca antes de clases, métodos o atributos.
             */
            System.out.println("Hola, este es un comentario para documentar el código.");

            // Código comentado: este código no se ejecuta.
            // System.out.println("Este es un ejemplo de código comentado que no se ejecuta.");
        }
    }
