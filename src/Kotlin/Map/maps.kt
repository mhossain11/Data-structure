package Kotlin.Map

fun main() {
    val m = mapOf<Int,String>(1 to "11",2 to "22",3 to "33",4 to "44",4 to "45")
    //only read,not add,not use null value

    println(m)
   /* m.forEach {t,u->
        println("$t and $u")
    }*/

}