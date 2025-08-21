//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun menu(){
        var opc: Int = 0
        while (opc !=3) {
            println("1) Buscar producto")
            println("2) Calcular promedio precio inventario")
            println("3) Salir")
            opc =  readLine()!!.toInt()
        }
    }

    val producto01 = mapOf("nombre" to "Laptop Gamer", "precio" to 1250.50, "categoria" to "tecnologia")
    val producto02 = mapOf("nombre" to "Libro Gamer", "precio" to 250.50, "categoria" to "Libros")
    val producto03 = mapOf("nombre" to "Las recetas de Manolo", "precio" to 350.50, "categoria" to "Libros")
    val inventario = listOf(producto01, producto02, producto03)



}