package sortingalgo;

public class quicksort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for (int j = low; j <high ; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]//its pivot position
         =temp;
        return i;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
        int pidx=partition(arr,low,high);
        quicksort(arr,low,pidx-1);
        quicksort(arr, pidx+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,4};
        int n=arr.length-1;

        quicksort(arr,0,n);
        for (int num:arr){
            System.out.print(num+",");
        }
    }

}
