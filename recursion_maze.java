public class recursion_maze {
    static void main(String[] args) {

        System.out.println(path_count(0,0,4,4));
    }
    public static int path_count(int i,int j,int n,int m){

     if (i==n || j==m){
         return 0;
     }

     if (i==n-1&&j==m-1){
         return 1;
     }
       int path_right_total=path_count(i+1,j,n,m);
      int path_down_total=path_count(i,j+1,n,m);
 return path_down_total+path_right_total;


    }
}