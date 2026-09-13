fun r_operacion(
    num1: Int,
    num2: Int,
    operacion: (Int, Int) -> Int
): Int {
    return operacion(num1, num2)
}
fun main () {
    val resultado = r_operacion(30, 5) { a, b ->
        a * b
    }
    println("Resultado: $resultado")
    }