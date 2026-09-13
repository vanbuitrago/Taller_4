data class Producto_Orden(
    val nombre: String,
    val precio: Double,
    val stock: Int
)
fun main () {
    val productos = listOf(
        Producto("Mouse", 45000.0, 20),
        Producto("Teclado", 80000.0, 14),
        Producto("Monitor", 639900.0, 8),
        Producto("Mousepad", 74000.0, 4)
    )
    val resultado = productos
        .filter { it.precio > 0 }
        .sortedByDescending { it.precio }
    resultado.forEach {
        println(it)
    }
}
