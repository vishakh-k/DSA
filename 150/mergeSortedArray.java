class mergeSortedArray{
    public static void merge(int[] nums1,int[] nums2,int m,int n){
        int idx=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[idx]=nums1[i];
                idx--; i--;
            }else{
                nums1[idx]=nums2[j];
                idx--; j--;
            }
        }
        while(j>=0){
            nums1[idx]=nums2[j];
            idx--; j--;
        }
    }
    public static void main(String [] args){
        int nums1[]={6,0,0};
        int nums2[]={4,5};
        int m=1;
        int n=2;
        merge(nums1,nums2,m,n);
        for(int i=0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}