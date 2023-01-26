package Java_P.Set;

import java.util.HashSet;
import java.util.Set;


public class Sets {
    public static void main(String[] args){
    Set<Integer> sa = new HashSet<>(); //Set object

        sa.add(1);
        sa.add(2);
        sa.add(3);
        sa.add(4);
        sa.add(5); //Duplicate value
        sa.add(5);//Duplicate value
        sa.add(null);//null support
        System.out.println(sa);  //serialize element

        //separate element
        for (Integer integer : sa) {
            System.out.println("integer:"+integer);
        }
        // System.out.println(sa.spliterator());
        System.out.println("Size:"+sa.size());// size
        System.out.println("Remove 5:"+sa.remove(5));//remove
        System.out.println("IsEmpty:"+sa.isEmpty()); //is Empty true/false
        System.out.println(sa); //list
        sa.clear();
        System.out.println("Clear:"+sa); //list

    }
}
