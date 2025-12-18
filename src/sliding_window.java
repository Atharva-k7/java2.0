import java.math.*;
public class sliding_window {
    public static void main(String[] args) {
        int arr[]={1,15,4,7,3,4};
        int sum=0;
        int maxsum=0;
        int k=3;
        for (int i =0; i <k ; i++) {
            sum +=arr[i];
        }System.out.println("1st loop"+sum);
       maxsum=sum;
        for (int i = 3; i < arr.length ; i++) {
            sum += arr[i] - arr[i-k];
           maxsum=Math.max(maxsum,sum);

        }
        System.out.print("{");
        for (int i = 3; i <arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print("}");
        System.out.println("second loop"+maxsum);

    }
}
