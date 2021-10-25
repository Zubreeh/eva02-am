import kotlin.system.exitProcess

var x: Int = 0
var estante: MutableList<String> = mutableListOf()



fun main (parametro: Array<String>){

    var j : Int
    j=0
    while(j==0) {
        println("ingrese usuario: ")
        var user: String = readLine()!!.toString()
        println("ingrese contraseña: ")
        var pass: String = readLine()!!.toString()
        if (pass == "admin" && user == "admin") {
            j = 1
        } else {
            println("Usuario o contraseña incorrecta. Intente nuevamente")
        }
    }

    do {
        menu()
    } while (j>0)

}




fun ingresar() {

    var titulo: String
    var genero: String
    var i:Int
    var detalle: String
    var formato: String
    var precio: String
    var cod: String
    var peso: String

    val libreria: MutableList<String> = mutableListOf()


    println("Ingrese nombre del libro")
    titulo = readLine()!!.toString()

    println("Ingrese ISBN del libro")
    cod = readLine()!!.toString()

    println("Ingrese genero del libro")
    println("   1. Ficción")
    println("   2. Infantil")
    println("   3. Drama")
    i = 1
    genero = "a"
        while(i!=0){
            i = readLine()!!.toInt()
            if(i == 1){
                genero = "Ficcion"
                i = 0
            }
            if(i == 2){
                genero = "Infantil"
                i = 0
            }
            if(i == 3){
                genero = "Drama"
                i = 0
            }
            if(i!=0) {
                println("Ingrese un genero valido!")
            }
        }
    println("Ingrese descripcion del libro")
    detalle = readLine()!!.toString()

    println("Ingrese formato del libro")
    println("   1. Digital")
    println("   2. Físico")
    i = 1
    formato = "a"
    while(i!=0){
        i = readLine()!!.toInt()
        if(i == 1){
            formato = "Digital"
            i = 0
        }
        if(i == 2){
            formato = "Fisico"
            i = 0
        }
        if(i!=0) {
            println("Ingrese una opcion valida!")
        }
    }

    println("Ingrese precio del libro")
    precio = readLine()!!.toString()

    println("Ingrese peso del libro")
    peso = readLine()!!.toString()

    libreria.add(x, peso)
    libreria.add(x, precio)
    libreria.add(x, formato)
    libreria.add(x, detalle)
    libreria.add(x, genero)
    libreria.add(x, cod)
    libreria.add(x, titulo)

    estante.add(x, libreria.toString())
    estante.size+1
    println(libreria)
    //x += 1
}


fun mostrarLibros(){

    println("$estante")

}
fun eliminarLibros(){
    println("¿Qué libro desea eliminar?")
    for (i in estante.indices){
        println("$i. " + estante[i])
    }
    var elim : Int = readLine()!!.toInt()
    estante.removeAt(elim)

}
fun modificarLibros(){
    println("¿Qué libro desea modificar?")
    for (i in estante.indices){
        println("$i. " + estante[i])
    }
    var lib : Int = readLine()!!.toInt()
    println()

}
fun salir(){
    exitProcess(0)
}

fun menu() {

    var continuar: Int

    println("1 Ingresar libro")
    println("2 Mostrar libro")
    println("3 Modificar libro")
    println("4 Eliminar libro")
    println("5 Salir")

    continuar = readLine()!!.toInt()

    when (continuar) {

        1 -> {
            ingresar()
        }
        2 -> {
            mostrarLibros()
        }
        3 -> {
            modificarLibros()
        }
        4 -> {
            eliminarLibros()
        }
        5 -> {
            salir()
        }
    }

}



class libro constructor(var titulo: String, var cod: String,var genero: String, var detalle: String,var formato: String,var precio: String, var peso : String)
