package MULTITHREADING;

public class Secondthread  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.printf("%d*",i);
        }
    }
}
