package MULTITHREADING;

public class testthread extends Thread{
    public static void main(String[] args) {
            Firsttestmultithread t1=new Firsttestmultithread();
            Secondthread t2=new Secondthread();
            thirdthread t3=new thirdthread();
            testrunable r1=new testrunable('a');

          long start=System.currentTimeMillis();
//        t1.start();
//        System.out.println("1st task");
//        t2.start();
//        System.out.println("2nd task");
//        t3.start();
//        System.out.println("3rd task");
//
        new Thread(r1).start();
        long end=System.currentTimeMillis();
        System.out.println("total time "+(end-start));
    }
}