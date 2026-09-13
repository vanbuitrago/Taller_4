data class producto_c(
    val nombre: String,
    val categoria: String
)
fun main () {
    val productos = listOf(
        producto_c("Mouse", "Tecnología"),
        producto_c("Teclado", "Tecnología"),
        producto_c("Sofá", "Hogar"),
        producto_c("Camiseta", "Ropa"),
        producto_c("Armario", "Hogar"),
        producto_c("Hoodie", "Ropa"),
        producto_c("Audífonos", "Tecnología")
    )
    val categorias = productos.groupBy {
        it.categoria
    }
    categorias.forEach { categoria, producto_c ->
        println("Categoria: $categoria")
        productos.forEach {
            println(it.nombre)
        }
        println()
    }
}