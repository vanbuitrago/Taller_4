fun main () {
    val preciosDolar = listOf(
        10.0,
        20.0,
        50.0
    )
    val tasaCambio = 3083.0
    val precioPeso = preciosDolar.map {
        it*tasaCambio
    }
    println(precioPeso)
}