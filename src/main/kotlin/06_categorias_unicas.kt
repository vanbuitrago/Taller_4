fun main() {

    val categorias = listOf(
        "Tecnología",
        "Hogar",
        "Tecnología",
        "Ropa",
        "Hogar"
    )
    val categoriasUnicas = categorias.distinct()
    println(categoriasUnicas)
}