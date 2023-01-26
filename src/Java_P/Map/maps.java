package Java_P.Map;


import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {
    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap();

        map.put(5,11);//add data "if not exist"
        map.put(4,22);
        map.put(3,33);
        map.put(2,44);
        map.put(null,null);

        System.out.println(map);

        map.put(1,111); //replace "data if exist" or add element
        System.out.println(map);

        for (Map.Entry pEntry : map.entrySet()){ //iterator key and value
            System.out.println(pEntry.getKey()+" "+pEntry.getValue());
        }

        System.out.println("containsKey:"+map.containsKey(1)); //lookup 1 key
        System.out.println("containsValue:"+map.containsValue(111));//lookup 111 value
        System.out.println("Size:"+map.size());
        map.remove(3);
        System.out.println("Remove 3:"+map);
        System.out.println("get value:"+map.get(5));
    }
}
