package Java_P.List.ArrayList_To_LinkedList.LinkedList;

import java.util.LinkedList;

public class Doubly_LinkedLists {
    public static void main(String[]args){
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> list1 = new LinkedList<String>();

        list.addFirst("This");
        list.addLast("is");
        list.add("a");
        list.add("list");
        System.out.println(list);

        list1.addFirst("Munna");
        list1.add("Raju");
        list1.addLast("Sohan");
        System.out.println(list1);

        //All object is add
        list.addAll(list1);
        System.out.println(list);

        //loops iterator
        for (String i :list){
            System.out.print(i+",");
        }
        System.out.println();

        //removeFirst=First element delete
        list.removeFirst();
        System.out.println("removeFirst:"+list);

        //removeLast=Last element delete
        list.removeLast();
        System.out.println("removeLast:"+list);

        //element duplicate
        list.add("is");
        list.clone();
        System.out.println("element duplicate:"+list);

        //all element clean
        list.clear();
        System.out.println("All Data is Clear"+list);
    }
}
