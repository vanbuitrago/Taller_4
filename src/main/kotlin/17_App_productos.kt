import kotlinx.coroutines.*
data class Producto_A(
    val nombre: String,
    val precio: Double,
    val stock: Int
)
suspend fun consultarProductos(): List<Producto> {
    delay(2000)
    return listOf(
        Producto("Mouse", 45000.0, 10),
        Producto("Teclado", 80000.0, 5),
        Producto("Monitor", 500000.0, 0),
        Producto("Webcam", 120000.0, 8)
    )
}
fun main() = runBlocking {
    try {
        println("Consultando productos...")

        val productos = consultarProductos()

        println("Digite el producto que desea buscar:")

        val busqueda = readLine() ?: ""
        val resultado = productos
            .filter { it.stock > 0 }
            .filter { it.nombre.contains(
                busqueda,
                    ignoreCase = true
                )
            }
            .sortedBy {it.precio}
        if (resultado.isEmpty()) {
            println("No se encontraron productos")
        } else {
            println("Productos encontrados:")
            resultado.forEach {
                println("${it.nombre} - $${it.precio} - Stock: ${it.stock}") }
        }
    } catch (e: Exception) {println("Error al consultar los productos: ${e.message}")}
}