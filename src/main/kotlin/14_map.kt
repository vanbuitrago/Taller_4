//MAP
fun main() {
    val precios = listOf(
        30000,
        70000,
        90000
    )
    val resultado = precios.map {
        it*2
    }
    println(resultado)
}