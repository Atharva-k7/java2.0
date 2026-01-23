package myownjava;

class arraylenfunc{
    public static int main(String[] args) {

        int arr[]={1,5,4,8,7,9,5,2};
        int count=0;

        try{
            while(true) {
                int temp = arr[count];
                count++;
            }
        }catch (IndexOutOfBoundsException e){

        }
        finally {
            return count;
        }
    }
}