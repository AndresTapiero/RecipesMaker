package model

class Ingrediente() {
    companion object {
        private var listFruits: ArrayList<Product> = ArrayList<Product>()

        fun addIngredients(fruit: String, quantity: Int) {


            println("Se agregaro: $quantity  $fruit")
            //saveIngrediente(Product(fruit, quantity))
            mostrarIngrediente()
        }

        fun mostrarIngrediente() {
/*            for (i: Ingrediente in listFruits) {
                println("availableFruits " + i.name + "Peso" + i.quantity)*/
        }
    }

    fun saveIngrediente(frutas: Product) {
        listFruits.add(frutas)
    }

}