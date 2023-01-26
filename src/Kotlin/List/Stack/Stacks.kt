package Kotlin.List.Stack

import java.util.*

fun main() {

    val s = Stack<Any>()

    //LIFO =Last In First Out  // zero element value of stack = -1
    s.push("Munna") //4 index //add element
    s.push(20) //3 index
    s.push(30) //2 indexLast In First Out
    s.push(40) //1 index


    println("Stack List:$s")
    println("index of 40:${s.search(40)}")//show index number
    println("index of 30:${s.search(30)}")
    println("index of 20:${s.search(20)}")
    println("index of Munna:${s.search("Munna")}")
    println()

    println("Stack List:$s")
    println("see Header/Top:${s.peek()}")//see header/top value
    println("Index Number:${s.search(40)}")
    println("Delete value:${s.pop()}")//remove and return value
    println("Stack List:$s")
    println("see Header/Top:${s.peek()}")//see header/top value
    println("Index Number:${s.search(30)}")//show index number
    println()

    println("Delete value:${s.pop()}")//remove and return value
    println("Stack List:$s")
    println("see Header/Top:${s.peek()}")
    println("Index Number:${s.search(20)}")
    println("Stack is Empty:${s.empty()}")


}