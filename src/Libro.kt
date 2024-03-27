class Libro(val id: String,
            val titulo: String,
            val autor: String,
            val anioPublicacion: Int,
            val tematica: String,
            ) {
    var estado = Estado.DISPONIBLE

}