class new123{
    public int a ;
    char string ;

    new123(int a ,char string ){
        this.a=a;
        this.string=string;
    }

   char getchar(){
        return string;
    }

    int  getint(){
        return a;
    }

    public static void main(String[] args) {
        new123 newmem=new new123(12, 's');

     char b= newmem.getchar();
        System.out.println(b);
    }
}