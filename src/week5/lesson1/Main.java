package week5.lesson1;

import week4.domain.Car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(123);
        Car c2 = new Car(124);

        Map m = new HashMap();
        m.put("123", c1);
        m.put("123", c2);

        Set set = m.keySet();
        for (Object key : set) {
            Object o = m.get(key);
            System.out.println(o);

        }
//
//        System.out.println("Now with entry set");
//        Set entrySet = m.entrySet();
//        for (Object entry : entrySet){
//            System.out.println(entry);
//        }
        System.out.println("ArrayList case");
        List l = new ArrayList();
        l.add(c1);
        l.add(c2);
        for (Object o : l) {
            System.out.println(o);

        }

        System.out.println("Hashset case");
        Set s = new HashSet();
        s.add(c1);
        s.add(c2);
        String str123First = "123";
        String str123Second = "123";
        System.out.println(str123First.hashCode());
        System.out.println(str123Second.hashCode());

        System.out.println("123".hashCode());
        System.out.println("123".hashCode());
        System.out.println("123".hashCode());
        for (Object o : s) {
            if (o==c1){
                System.out.println("c1");
            } else if (o==c2){
                System.out.println("c2");
            } else {
                System.out.println("another");
            }
            System.out.println(o);

        }

    }
}
