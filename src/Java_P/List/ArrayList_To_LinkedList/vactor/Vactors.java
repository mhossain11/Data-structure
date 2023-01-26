package Java_P.List.ArrayList_To_LinkedList.vactor;

import java.util.Vector;

public class Vactors {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(v); //pass object
        Vector v2 = new Vector(5); //initialCapacity
        Vector v3 = new Vector(2,1);

        v3.add(121f);//add element
        v3.add(122f);
        v3.add(123f);
        v3.addElement(v1);//add object
        v1.add("kamals");
        v1.add(12.4);
        v1.add(12.4);
        v1.add(12.4);
        v.add(1);
        v.add(2);
        v.add(3);
        v.setElementAt("qqq",2);

        System.out.println(v3.capacity());//size
        System.out.println(v3.firstElement());//first element print
        System.out.println(v3.lastElement());//last element print
        System.out.println(v3.removeElement(112f)); //remove and return boolean
        v3.removeElementAt(2);//remove  index base
        v3.removeAllElements();//remove  index base
        System.out.println(v3);//all list print
        System.out.println(v);//all list print



    }
}
