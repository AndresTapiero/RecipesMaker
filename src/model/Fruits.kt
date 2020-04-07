package model

import addIngredients


class Fruits{
  var option: Int = 0
  lateinit var fruit: String
  var quantity: Int = 0
  val copyFruits = "Las frutas que tenemos son:"


  fun showProductList(){
    val availableFruits = listOf("1) Fresa","2) Bananos","3) Uvas","4) Manzana")
    println(copyFruits)
    availableFruits.forEach { println(it) }
    selectedFruit()
  }

  private fun selectedFruit() {
    println("Seleccione su ingrediente")
    option = readLine()?.toInt() as Int
    when (option){
      1 ->{
        fruit = "Fresa"
        println("Inserte la cantidad  ")
        quantity = readLine()?.toInt() as Int
        Ingrediente.addIngredients(fruit,quantity)
      }
      2 ->{
        fruit = "Bananos"
        Ingrediente.addIngredients(fruit,quantity)

      }
    }
  }


}
