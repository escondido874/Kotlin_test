import kotlin.contracts.Returns

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val producto01 = mapOf("nombre" to "laptop gamer", "precio" to 1250.50, "categoria" to "tecnologia")
    val producto02 = mapOf("nombre" to "libro gamer", "precio" to 250.50, "categoria" to "Libros")
    val producto03 = mapOf("nombre" to "las recetas de manolo", "precio" to 350.50, "categoria" to "Libros")
    val inventario = listOf(producto01, producto02, producto03)





    fun buscarProd(nombre: String) {
        for (producto in inventario) {
            if (producto["nombre"] == nombre) {
                println(producto)
                return
            }
        }
        println("producto no encotrado")
    }


    fun menu() {
        var opc: Int = 0
        while (opc != 3) {
            println("1) Buscar producto")
            println("2) Calcular promedio precio inventario")
            println("3) Salir")
            opc = readLine()!!.toInt()
            when(opc){
                1-> buscarProd(nombre = readLine()!!)

                3-> print("Saliendo")
            }
        }
    }


    println(inventario)
    menu()

}