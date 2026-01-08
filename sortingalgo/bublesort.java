package sortingalgo;

import java.util.Arrays;

public class bublesort {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        bubblesort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubblesort(int[] arr){
        int temp=0;
        boolean isSwap;
        for (int i = 0; i < arr.length-1 ; i++) {
            isSwap=false;
            for (int j = 0; j < arr.length-i-1; j++) {

                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    isSwap=true;
                }
            }  if (!isSwap) {
                break;
            }
        }
    }
}
