fun main(args: Array<String>) {

    val parrafo = """
    ** Seleccione la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. salir
    seleccione un número
    """.trimIndent()

    val recetas = listOf("Arroz Paisa, ", "Plato Mexicano, ", "Calentado, ", "Ajiaco, ", "Chiguiro")
    val currentOption = "Ha seleccionado la opción"
    println("::Bienvenido a Recipe Maker::")
    println(parrafo)
    var opt: String? = readLine()

    when (opt) {
        "1" -> {
            println(viewRecipe(category = " crear recetas opción $opt"))
            makeRecipe()
        }
        "2" -> {
            println("$currentOption: $opt")
            println(viewRecipe(category = " ver mis recetas opción 2 $opt"))
            println("Sus recetas son:")
            recetas.forEach { print(it) }
        }
        "3" -> println("$currentOption $opt gracias por usar Recipe maker")
        else -> println("El valor $opt no esta en el rango")
    }
}


fun makeRecipe() {
    val titleIngredients = "Los ingredientes que tenemos son: "
    println(titleIngredients)
    val ingredientes = listOf(
        "1) Agua, ",
        "2) Leche, ",
        "3) Carne, ",
        "4) Verduras, ",
        "5) Frutas, ",
        "6) Cereal, ",
        "7) Huevos ",
        "8) Aceite"
    )
    ingredientes.forEach { (println(it)) }
    println("Agregue un ingredientes seleccionando el número: ")
    addIngredients()
}

fun viewRecipe(category: String): Unit {
    println("La Categoria seleccionada es : $category")

}

fun addIngredients() {
    do {
        println("Seleccione el # del ingrediente a agregar")
        loop@ do {
            val ingre: Int = readLine()?.toInt() as Int
            when (ingre) {
                1 -> {
                    println("Agua Agregada")
                    break@loop
                }
                2 -> {
                    println("Leche Agregada")
                    break@loop
                }
                3 -> {
                    println("Carne Agregada")
                    break@loop
                }
                4 -> {
                    println("Verduras Agregada")
                    break@loop
                }
                5 -> {
                    println("Frutas Agregada")
                    break@loop
                }
                6 -> {
                    println("Cereal Agregada")
                    break@loop
                }
                7 -> {
                    println("Huevos Agregada")
                    break@loop
                }
                8 -> {
                    println("Aceite Agregada")
                    break@loop
                }
                else -> println("Valor no encontrado")
            }
        } while (break)
        println(
            """
            Presione: 
                1) para agregar otro ingrediente
                2) para salir
        """.trimIndent()
        )
        val input = readLine()?.toInt() as Int
    } while (input == 1)
}



