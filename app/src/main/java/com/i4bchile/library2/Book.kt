package com.i4bchile.library2


/*
● Nombre del libro.
● ISBN.
● Año publicación
● Editorial
● Cantidad de páginas
● Precio
● Autor del libro
● Tipo de libro (D: Digital / I: Impreso)
 */
data class Book(val title:String,
                val isbn:String,
                val yearPub:Int,
                val publisher: String,
                val numPages: Int,
                val price:Int,
                val author:String,
                val bookType:BookType
                )


sealed class BookType
class Printed:BookType(){
    override fun toString(): String {
        return "I"
    }
}
class Digital:BookType(){
    override fun toString(): String {
        return "D"
    }
}