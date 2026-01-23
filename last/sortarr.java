import java.util.Arrays;

public class sortarr {
    public static void main(String[] args) {
        int[] a = {1,3,4,5,1,9,7};
        sort_arr(a);
        display(a);
        System.out.println("\n"+a.length);
    }

    public static int sort_arr(int[] arr){
    for(int i=arr.length-1;i>=0;i--){
            for(int k=arr.length-i-1;k>=0;k--){

               if (arr[i]<arr[k]){
                   int temp=arr[i];
                    arr[i]=arr[k];
                   arr[k]=temp;
               }
            }
        }

        System.out.println("...........");

        return 0 ;
    }
public static int display(int[] arr)
{
    for(int j=0;j<=arr.length-1;j++)
    {
        System.out.println(arr[j]);
    }return 0;
}}

