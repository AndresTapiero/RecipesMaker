

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
                println(viewRecipe(category = "$currentOption $opt"))
                makeRecipe()
            }
            "2" -> {
                println("$currentOption: $opt")
                println(viewRecipe(category = "$currentOption $opt"))
                println("Sus recetas son:")
                recetas.forEach { print(it) }
            }
            "3" -> println("$currentOption $opt gracias por usar Recipe maker")
            else -> println("El valor $opt no esta en el rango")
        }
    }


fun makeRecipe(){
    val titleIngredients = "Los ingredientes que tenemos son: "
    println(titleIngredients)
    val ingredientes = listOf("1) Agua, ", "2) Leche, ", "3) Carne, ", "4) Verduras, ", "5) Frutas, ", "6) Cereal, ", "7) Huevos ", "8) Aceite")
    ingredientes.forEach{(println(it))}
    println("Agregue sus ingredientes seleccionando el número: ")
    addIngredients()
}

fun viewRecipe(category: String):Unit{
    //viewRecipe() -> Mostrará el título de la categoría ingresada, así: Ver mis recetas
    println("La Categoria seleccionada es : $category")

}

fun addIngredients() {
    loop@ do {
        val ingrediente = """
        """.trimIndent()
        println(ingrediente)
        val ingre: Int = readLine()?.toInt() as Int
        when(ingre){
            1-> {print("Agua Agregada")
                break@loop
            }
            else -> println("Valor no encontrado")
        }
    }while (ingre!=9)
}



