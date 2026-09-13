fun main () {
    val ventas = listOf(
        50000.0,
        75000.0,
        120000.0,
        35000.0,
        90000.0
    )
    println ("Total: ${ventas.sum()}")
    println ("Promedio: ${ventas.average()}")
    println ("Venta máxima: ${ventas.maxOrNull()}")
    println ("Venta mínima: ${ventas.minOrNull()}")
}