package sortingalgo;

public class mergedsort {
    //o(n)
    public static void divide(int arr[],int si,int ei){
        // This func will divide the arr in two not actually divede but maps
if(si>=ei){
    return;
}
                   //this mid will getthe  mid point of an array
        int mid=si+(ei-si)/2;
                       //this will divid ethe array in two by using  mid as endpoint means it will have left part of array
        divide(arr,si,mid);
                    //this will have right parrt of an array after getting mid+1 to end
        divide(arr,mid+1,ei);

        conquere(arr,si,mid,ei);
    }
    //o(logn)
    public static void conquere(int arr[],int si,int mid,int ei){

        int merged[]=new int[ei-si+1];  //we need an extra space to save elemnst {}
        int idx1=si;                    //the starting index as pointer staring from the start of an array passed from the divide function
        int idx2=mid+1;                 //the starting index from second right array is from mid +1
        int x=0;                        //this is the index for the merged array

        // this loop will run when pointer of arr left (idx1) is lesser than mid and pointer of right array is lesser then end
        while(idx1<=mid && idx2<=ei){
       //this condition will check the pointer element and then put in merged arr and move x pointer to x++
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }

        //this loop will check if the divide arrays left arr and right arr left any elment if yes then moved oneshot to merged array
        //this check for left array
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        //this check for right array
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        //this loop will copy and paste elemets from merged arr to normal array
        for (int i=0,j=si;i< merged.length ; i++,j++) {
            arr[j]=merged[i];

        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,3,2,5};
        //this will give the ending index as lenght is from is -1
        int n= arr.length-1;


        divide(arr,0,n);//runs function
        for (int num:arr){//loops print main array
            System.out.print(num+",");
        }

    }
}
