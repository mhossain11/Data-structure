package Java_P.Set.Set_HashSet;


import java.util.HashSet;
import java.util.Iterator;
public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> sa1 = new HashSet<>();
        sa1.add(11);
        sa1.add(22);
        sa1.add(33);
        sa1.add(44);//Duplicate value
        sa1.add(44);//null support
        sa1.add(null);

        System.out.println(sa1);
        Iterator<Integer> s1= sa1.iterator(); //separate element
        while (s1.hasNext()){
            System.out.println(s1.next());
        }
        System.out.println("Size:"+sa1.size());// size
        System.out.println("Remove 44:"+sa1.remove(44));//remove
        System.out.println("IsEmpty:"+sa1.isEmpty()); //is Empty true/false
        System.out.println(sa1); //list
        sa1.clear();
        System.out.println("Clear:"+sa1); //list
    }
}
