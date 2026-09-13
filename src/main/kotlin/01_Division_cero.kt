fun main() {
   try {
       val num1 = 50
       val num2 = 0
       val Resultado = num1 / num2
       println("Resultado: $Resultado")
   } catch (e: Exception) {
       println("Error: no se puede dividir entre cero.")
   }
}