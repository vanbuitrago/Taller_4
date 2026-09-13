fun calcular(
    num1: Double,
    num2: Double,
    operacion: (Double, Double) -> Double
): Double {
    return operacion(num1, num2)
}
fun main() {
    val suma = calcular(3.0, 67.0) { a, b -> a + b }
    val resta = calcular(10.0, 5.0) { a, b -> a - b }
    val multiplicacion = calcular(10.0, 5.0) { a, b -> a * b }
    println("Suma: $suma")
    println("Resta: $resta")
    println("Multiplicacion: $multiplicacion")
}
