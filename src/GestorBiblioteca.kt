class GestorBiblioteca(private val catalogoDeLibros:MutableList<Libro>, private val registroDePrestamos: MutableList<Registro>) {

    fun agregarLibroACatalogo(libro: Libro){
        catalogoDeLibros.add(libro)
    }
    fun eliminarLibroCatalogo(libro: Libro){
        catalogoDeLibros.remove(libro)
    }
    fun registrarPrestamo(libro: Libro){
        if (consultarDisponibilidadLibro(libro)){
            libro.estado = Estado.PRESTADO
        }
    }
    fun devolverLibro(libro: Libro){
        if(consultarDisponibilidadLibro(libro)){
            libro.estado = Estado.DISPONIBLE
        }
    }
    fun consultarDisponibilidadLibro(libro: Libro):Boolean{
        return libro.estado == Estado.DISPONIBLE
    }
    fun retornarTodosLosLibros(estado: Estado):MutableList<Libro>{
        val librosADevolver: MutableList<Libro> = mutableListOf()
        for (libro in catalogoDeLibros){
            if (libro.estado == estado ){
                librosADevolver.add(libro)
            }
        }
        return librosADevolver
    }
}