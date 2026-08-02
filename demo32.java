package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class demo32 {
    public static void main(String[] args) {
        //  sets = no want duplicate and no order we use sets only unique
        // 1st - hashset->implpnet linked hashset
        // 2ns ->sorted set->navigable set-> tree set

        SortedSet<Integer> ss = new TreeSet<>();

        ss.add(12);
        ss.add(21);
        ss.add(2);

        System.out.println(ss); // we are getting soirted input then by jvm using camparable (interface ) in ascending order and if we ewnat our sorting then we use caparator


















    }
}
