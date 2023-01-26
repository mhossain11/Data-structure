package Kotlin.Set.Set_HashSet

fun main() {
    val hs = hashSetOf<Int>()
    val hs1 = hashSetOf(12,3,45,6,null)

    hs.add(1)
    hs.add(2)
    hs.add(3)
    hs.add(4)
    hs.add(5)

    println(hs)
    println(hs1)
}