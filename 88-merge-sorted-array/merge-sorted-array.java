class Solution {
    // int[] bubble(int[] nums1){
    //         boolean swaped;
    //         for(int i=0;i<nums1.length;i++){
    //             swaped=false;
    //             // int len=<nums1.legth;
    //             for(int j=i+1;j<nums1.length-i;j++){
    //                 if(nums1[j]<nums1[j-1]){
    //                     int temp=nums1[j];
    //                     nums1[j]=nums1[j-1];
    //                     nums1[j-1]=temp;
    //                     swaped=true;
    //                 }
    //             }
    //             if(swaped==false){
    //                 break;
    //             }
    //         }
    //         return nums1;
    // }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        // bubble(nums1);
        Arrays.sort(nums1);
        }
}