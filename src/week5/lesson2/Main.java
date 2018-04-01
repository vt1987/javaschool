package week5.lesson2;

import week4.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(123);
        Car c2 = new Car(124);
        Car c3 = new Car(125);
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = null;

        list1.add(c1);
        list2.add(c2);

        ListComparisonHelper helper = new ListComparisonHelper();
        assert (helper.compare(list1, list3) == true);


    }
}
