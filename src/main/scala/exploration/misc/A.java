package exploration.misc;

import exploration.datastructures.LinkedList;

public class A {
    static String test() {
        return "test";
    }

    static void longTest(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(test());
        }
    }

    static LinkedList javaToScala() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        System.out.println("spooky:" + list);

        return list;
    }
}
