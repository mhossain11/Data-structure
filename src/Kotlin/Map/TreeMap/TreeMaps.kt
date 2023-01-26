package Kotlin.Map.TreeMap

import java.util.TreeMap

fun main() {
    val tm = TreeMap<Int,String>()

    tm.put(1,"Munna")
    tm.put(2,"Rana")
    tm.put(3,"Kamal")
    tm.put(4,"Raju")
    tm.put(5,"Sohan")

    println(tm)
    for(i in tm){
        println("${ i.value } : ${i.key}")
    }

   //tm.forEach { println("${ it.key } : ${it.value}") }

   /* for (entry in tm.entries.iterator()){
        println("${entry.key} : ${entry.value}")
    }*/
}