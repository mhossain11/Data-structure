package Kotlin.List

fun main() {
    val l = listOf(1,2,3,4)  //onle read //not add
    val l1 = listOfNotNull(6,null,43,67) //it is not null or empty list

    //add elements

println(l1.size)
println(l1)
   /* for (i in l){
        println(i)
    }*/
    l.forEach{ println(it) }
    println(l.isEmpty())
    println(l.get(3))
    println(l.size)
    println("Search :${ l.binarySearch(3) }")
}