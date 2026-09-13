fun main() {
    val precios = listOf(
        10000.0,
        20000.0,
        30000.0
    )
    val total = precios.fold(0.0) { acumulador, precio ->
        acumulador + precio
    }
    println("Total del carrito: $total")
}