import java.lang.Integer.parseInt
import kotlin.text.toInt as toInt1

fun main(args: Array<String>) {

    val recetas = listOf("Arroz Paisa, ", "Plato Mexicano, ", "Calentado, ", "Ajiaco, ", "Chiguiro")
    val currentOption = "Ha seleccionado la opción"
    println("::Bienvenido a Recipe Maker::")
    println("Bienvenido a su bucle")
    val parrafo = """
        Seleccione:
        1) Para continuar en el bucle
        2) Para Salir del bucle
    """.trimIndent()

    println(parrafo)

    val input1 = readLine()?.toInt1() as Int
    println("El número que selecciono es el $input1")
    if (input1 == 1){
        do {
            println("Sigue en el bucle, presione de nuevo el número")
            val input = readLine()?.toInt1() as Int
        } while (input == 1)
        println("Gracias por salir del bucle")
    }



/*        when (opt) {
            "1" -> {
                println(viewRecipe(category = " crear recetas opción $opt"))
                makeRecipe()
            }

            else -> println("El valor $opt no esta en el rango")
        }*/
}




