package Kotlin.List

fun main() {
    val a = mutableListOf<Int>()  //read and write
    a.add(10)
    a.add(11)
    a.add(12)
    a.add(13)
  println(a)
    a.forEach{ println("Iterate:$it") }
    println("isempty:${a.isEmpty()}")
    println(a.get(3))
    println("Size:${a.size}")
    println("Search :${ a.binarySearch(13) }")
    println("Remove:${ a.remove(11)}")
    println(a)
    println(a.set(2,15))
    println(a)



}