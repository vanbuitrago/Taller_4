fun calcularPrecioFinal(
    precio: Double,
    porcentajeDescuento: Double
): Double {

    val descuento = precio * porcentajeDescuento / 100

    return precio - descuento
}

fun main() {

    val resultado = calcularPrecioFinal(
        7400000.0,
        10.0
    )

    println("Precio final: $resultado")
}