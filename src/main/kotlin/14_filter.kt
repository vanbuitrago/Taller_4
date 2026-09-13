//FILTER
fun main () {
    val precios = listOf(
        30000,
        70000,
        90000,
    )
    val resultado = precios.filter {
        it > 50000
    }
    println(resultado)
}