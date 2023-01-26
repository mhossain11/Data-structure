package Kotlin.Set

fun main() {
    val s = mutableSetOf<Int>() //read and write

    s.add(1)
    s.add(2)
    s.add(3)
    s.add(4)
    s.add(5)//can not use duplicate element
    s.add(5)

    println(s)
    s.forEach{ println(it) }
    println(s.size)
}