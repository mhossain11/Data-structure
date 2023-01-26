package Java_P.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();

        hm.put(3,"Munna");
        hm.put(2,"Raju");
        hm.put(1,"Robin");
        hm.put(5,"Rana");
        hm.put(4,"Kamal");

        System.out.println(hm);

        for (Map.Entry p : hm.entrySet()){ //iterator key and value
            System.out.println(p.getKey()+" "+p.getValue());
        }



    }
}
