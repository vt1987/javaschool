package week5.lesson2;

import java.util.List;

public class ListComparisonHelper {
    public boolean compare(List list1, List list2) {

        if (notvalid(list1, list2)) return false;
        int index = 0;
            for (Object o1 : list1) {

                Object o2 = list2.get(index);
                if (o1.equals(o2)) {
                    index++;
                    continue;
                } else {

                    System.out.println();
                    return false;
                }
            }
            return true;

    }

    private boolean notvalid(List list1, List list2) {
        if (list1 == null || list2 == null){
            return true;

        }
        if (list1.size() == list2.size()) {
            return false;
        }
        return false;
    }
}
