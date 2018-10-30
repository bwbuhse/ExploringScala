public class A {
    static String test() {
        return "test";
    }

    static void longTest(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(test());
        }
    }
}
