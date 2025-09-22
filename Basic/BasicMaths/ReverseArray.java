package BasicMaths;

public class ReverseArray{
    public void reverseArr(int arr[]){
        int n=arr.length;
        int start=0,end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        int arr[]={1,3,4,5,6};
        r.reverseArr(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}