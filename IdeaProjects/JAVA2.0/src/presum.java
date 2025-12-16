import java.util.Arrays;

public class presum {
    public static void main(String[] args) {
        int[] arr ={1,5,4,8,6,9};
        System.out.println( Arrays.toString( prefix_sum(arr)));
    }
    public static int[] prefix_sum(int[] arr ){
        for (int i = 1; i<arr.length ; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println("----------");
        return arr;
    }
}



