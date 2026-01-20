package MULTITHREADING;

public class testthread {
    static void main() {
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d+",i);
        }
        System.out.println("first task");
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d$",i);
        }
        System.out.println("sn task");
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d*",i);
        }
        System.out.println("third task");
        long end=System.currentTimeMillis();
        System.out.println("total time "+(end-start));
    }
}
