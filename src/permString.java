public class permString {
    private static boolean aBoolean;

    static void main(String[] args) {
        permStr("abc","");
    }

  public static void permStr(String s,String permutation) {
int j=0;
        if (s.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i <s.length() ; i++) {
          char currCHAR=s.charAt(i);

          String newstr=s.substring(0,i)+s.substring(i+1);
          permStr(newstr,permutation+currCHAR);
          for (j =0; j<i;j++);
            System.out.println("j runs "+j);
      }

    }
}
