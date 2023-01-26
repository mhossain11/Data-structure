package Kotlin.List.LinkedList

import java.util.LinkedList

fun main() {
    val ls = LinkedList<Int>()
    val ls1 = LinkedList<Int>()

    ls.addFirst(10)
    ls.add(20)
    ls.add(2,40)
    ls.add(3,50)
    ls.add(4,60)
    ls.addLast(70)

    ls1.addFirst(10)
    ls1.add(20)
    ls1.add(2,40)
    ls1.add(3,50)
    ls1.add(4,60)
    ls1.addLast(70)

    println(ls)

    //All object is add
    ls.addAll(ls1)
    println(ls)

    //loops iterator
    for (i in ls){
        print("$i ")
    }
    println()

    //removeFirst=First element delete
    ls.removeFirst()
    println("RemoveFirst: $ls")

    //removeLast=Last element delete
    ls.removeLast()
    println("RemoveLast: $ls")

    //element duplicate
     ls.clone()
    println("Clone: $ls")

    //all element clean
    ls.clear()
    println(ls)
}