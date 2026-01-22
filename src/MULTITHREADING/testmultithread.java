package MULTITHREADING;

class Firsttestmultithread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <1000 ; i++) {
            System.out.printf("%d#",i);
        }
    }
}
