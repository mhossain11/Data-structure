package Java_P.Map.Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Hashtables {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable();

        ht.put(100,"Amit");
        ht.put(102,"Ravi");
        ht.put(101,"Vijay");
        ht.put(103,"Rahul");

        System.out.println(ht);

        for (Map.Entry p : ht.entrySet()){
            System.out.println(p.getKey()+" "+p.getValue());
        }
    }
}
