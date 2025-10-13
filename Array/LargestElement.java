package Array;

public class LargestElement {
    public static int largest(int[] arr) {
        // code here
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                 max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,20,3,4,5};
        LargestElement l = new LargestElement();
        int max=l.largest(arr);
        System.out.println(max);
    }
}
