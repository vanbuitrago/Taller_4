data class Producto_S(
    val nombre: String,
    val precio: Double,
    val stock: Int
)
fun main() {
    val productos = listOf(
        Producto("Mouse", 45000.0, 10),
        Producto("Teclado", 80000.0, 5),
        Producto("Monitor", 500000.0, 0),
        Producto("Webcam", 850000.0, 8)
    )
    val resultado = productos
        .filter { it.stock > 0 && it.precio > 50000 }
        .sortedBy { it.precio }
    resultado.forEach {
        println(it)
    }
}
