package Kotlin.Map

fun main() {
    val m = mutableMapOf<Int,Int>()
    //only read,not add,not use null value

    m.put(1,11)
    m.put(2,22)
    m.put(3,33)
    m.put(4,44)
    m[5]=5

    println(m)

    m.forEach { t, u ->
        println("$t and $u")
    }
    m.remove(2)
    println(m)
}