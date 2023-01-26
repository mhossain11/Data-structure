package Kotlin.List.Vactor

import java.util.Vector

fun main() {
    val v = Vector<Any>()
    val v1 = Vector(v)
    val v2 = Vector<Any>(5)

    v.add(1)
    v.add(5)
    v.add(4)
    v.add(6)
    v2.add("kamal")
    v2.add(2)
    v2.add(3)
    v2.add(3)
    v2.add(null)
    v2.add(null)
    v2.addElement(v)

    println(v2.capacity())
    println(v2)
    println(v2.remove(1))
    println(v2)
}