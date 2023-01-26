package Kotlin.Set.Set_TreeSet

import java.util.TreeSet

fun main() {
    val ts = TreeSet<Int>()

    ts.add(1)
    ts.add(2)
    ts.add(3)
    ts.add(4)
    ts.add(5)

    println(ts)
    println(ts.first())
    println(ts.last())
}