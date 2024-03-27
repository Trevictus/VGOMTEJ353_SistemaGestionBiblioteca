import java.util.Scanner

class Menu {
    fun MenuUsuario() {
        val scanner = Scanner(System.`in`)
        val opciones = arrayOf(
            "Agregar libro al catálogo.",
            "Eliminar libro del catálogo.",
            "Registrar préstamo.",
            "Devolver libro.",
            "Consultar disponibilidad de libro.",
            "Retornar libros.",
            "Salir"
        )
        var opcion: String
        val gestorBiblioteca: GestorBiblioteca

        do {
            println("************ MENÚ BIBLIOTECA ************")
            for (i in opciones.indices) {
                println("${i + 1}. ${opciones[i]}")
            }
            println("Elige una opción:")

            opcion = scanner.nextLine()

            when (opcion) {
                "1" -> println("Has elegido ${opciones[0]}.")
                "2" -> println("Has elegido ${opciones[1]}.")
                "3" -> println("Has elegido ${opciones[2]}.")
                "4" -> println("Has elegido ${opciones[3]}.")
                "5" -> println("Has elegido ${opciones[4]}.")
                "6" -> println("Has elegido ${opciones[5]}.")
                "7" -> println("Salir.")
                else -> println("Opción no válida. Por favor, elige una opción del MENÚ BIBLIOTECA.")
            }
        } while (opcion != "7")
    }
    fun agregarLibroACatalogo(gestorBiblioteca: GestorBiblioteca){
        val libro1 = Libro("1", "el señor de los anillos", "paquito", 2023, "romance")
        gestorBiblioteca.agregarLibroACatalogo(libro1)
    }
    fun eliminarLibroCatalogo(){

    }
    fun registrarPrestamo(){

    }
    fun devolverLibro(){

    }
    fun consultarDisponibilidadLibro(){

    }
    fun retornarTodosLosLibros(){

    }
}