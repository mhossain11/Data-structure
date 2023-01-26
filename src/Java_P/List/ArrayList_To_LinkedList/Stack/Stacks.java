package Java_P.List.ArrayList_To_LinkedList.Stack;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack s = new Stack();

        //LIFO =Last In First Out   // zero element value of stack = -1
        s.push("Munna"); //4 index //add element
        s.push(20);//3 index
        s.push(30);//2 indexLast In First Out
        s.push(40.3);//1 index

        System.out.println("Stack List:"+s);
        System.out.println("index of 40.3:"+s.search(40.3));//show index number
        System.out.println("index of 30:"+s.search(30));//show index number
        System.out.println("index of 20:"+s.search(20));//show index number
        System.out.println("index of Munna:"+s.search("Munna"));//show index number
        System.out.println();

        System.out.println("Stack List:"+s);
        System.out.println("see Header/Top:"+s.peek()); //see header/top value
        System.out.println("Index Number:"+s.search(40.3));//show index number
        System.out.println("Delete value:"+s.pop());//remove and return value
        System.out.println("Stack List:"+s);
        System.out.println("see Header/Top:"+s.peek()); //see header/top value
        System.out.println("Index Number:"+s.search(30));//show index number
        System.out.println();

        System.out.println("Delete value:"+s.pop());//remove and return value
        System.out.println("Stack List:"+s);
        System.out.println("see Header/Top:"+s.peek()); //see header/top value
        System.out.println("Index Number:"+s.search(20));//show index number

        System.out.println("Stack is Empty:"+s.empty());
    }
}
