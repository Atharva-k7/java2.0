package MULTITHREADING;

public class testrunable implements Runnable{
    private final char charcater;
    public testrunable(char charcater){
        this.charcater=charcater;
    }
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.printf("%d %c",i,charcater);
        }
    }
}
