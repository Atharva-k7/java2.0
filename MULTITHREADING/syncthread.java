package MULTITHREADING;

 class COUNTER {
    private  int count=0;
    public synchronized void count_access(){
        count++;
    }
     public int getCounter(){
         return count;
     }
}
    class SYNCTHREAD1 extends Thread{
      private COUNTER counter;
      public SYNCTHREAD1(COUNTER counter){
          this.counter=counter;
      }

      public void run(){
          for (int i = 0; i <100 ; i++) {
              counter.count_access();
          }
      }
    }
        class SYNCTHREAD2 extends Thread{
            private COUNTER counter;
            public SYNCTHREAD2(COUNTER counter){
                this.counter=counter;
            }

            public void run(){
                for (int i = 0; i <100 ; i++) {
                    counter.count_access();
                }
            }
        }

        class Synced {
            static void main(String[] args) throws Exception{
                COUNTER counter=new COUNTER();
                SYNCTHREAD1 t1=new SYNCTHREAD1(counter);
                SYNCTHREAD2 t2=new SYNCTHREAD2(counter);

               try {
                   t1.start();
                   t2.start();

                   t1.join();
                   t2.join();

                   System.out.println("number of count"+counter.getCounter());
               }
               catch (Exception e){
                   System.out.println(e.getMessage());
               }
            }
        }
