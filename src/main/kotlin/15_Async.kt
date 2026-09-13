import kotlinx.coroutines.*
suspend fun consulUsuarios(): String {
    delay(2000)
    return "Usuarios descargados"
}
suspend fun consulProductos(): String {
    delay(1000)
    return "Productos descargados"
}
fun main() = runBlocking {
    val usuarios = async {
        consulUsuarios()
    }
    val productos = async {
        consulProductos()
    }
    println(usuarios.await())
    println(productos.await())
}