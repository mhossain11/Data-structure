package Java_P.Set.Set_TreeSet;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {

        TreeSet tr = new TreeSet();


        tr.add(1);
        tr.add(2);
        tr.add(3);
        tr.add(4);
        tr.add(5);
        tr.add(6);

        System.out.println(tr);
        System.out.println("Size:"+tr.size());
        System.out.println("First:"+tr.first());
        System.out.println("Last:"+tr.last());
        tr.pollFirst();//remove first element
        tr.pollLast();//remove last element
        System.out.println(tr);
        System.out.println("Higher:"+tr.higher(3));
        System.out.println("lower:"+tr.lower(3));
       for (Object integer :tr){
           System.out.println(integer);
       }

        System.out.println("isEmpty:"+tr.isEmpty());
        System.out.println("clone:"+tr.clone());
        System.out.println("head:"+tr.headSet(5));
        System.out.println("tail:"+tr.tailSet(3));
        System.out.println(tr.contains(7));
        System.out.println("Remove:"+tr.remove(4));
        System.out.println("List"+tr);
        tr.clear();
        System.out.println("Clear All Data:"+tr);

    }
}
