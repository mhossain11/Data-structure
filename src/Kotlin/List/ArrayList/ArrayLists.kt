package Kotlin.List.ArrayList

fun main() {
val a = ArrayList<Int>()


    a.add(50)
    a.add(20)
    a.add(10)
    a.add(2)

    //loops iterator
    for (i in a){
        println(i )
    }

    //get elements(get data by index)
    print("element of index:${a[0]}")
    println()

    //add element in between
    a.add(4,50)
    println(a )

    //set element(replies element)
    a.add(1,70)
    println("replies element: $a" )

    //delete element
    a.remove(70)
    println("delete element: $a" )

    //Size
    println("Size : ${a.size} ")

    //sorting
    a.sort()
    println("Sorting: $a")

    //iterator
    val iterator=a.iterator()
    print("iterator:")
    while (iterator.hasNext()){
        val element = iterator.next()
        print("$element ")
    }
    println()

    //foreach
    print("forEach:")
    a.forEach{ element ->
        print(" $element ")
    }
    println()

    //ListIterator
    val listIterator=a.listIterator()
    print("listIterator:")
    while (listIterator.hasNext()){
        val element = listIterator.next()
        print("$element ")
    }
    println()

}