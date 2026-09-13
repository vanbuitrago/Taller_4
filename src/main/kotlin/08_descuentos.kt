fun calcularDescuento(
    precio: Double,
    descuento: Double
): Double {
    return precio - (precio*descuento/100)
}
fun main () {
    val precio = 350000.0
    println("10%: ${calcularDescuento(precio, 10.0)}")
    println ("20%: ${calcularDescuento(precio, 20.0)}")
    println ("30%: ${calcularDescuento(precio, 30.0)}")
}