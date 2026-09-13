fun main () {
    val precios = listOf(
        30000.0,
        60000.0,
        100000.0,
        150000.0
    )
    val resultado = precios
        .filter { it > 50000 }
        .map {it*0.90}
        .sorted()
    println(resultado)
        }