class Solution {
    public int removeDuplicates(int[] nums) {
        int flg=0;
        if(nums.length == 0) return 0;
        for (int i=1;i<nums.length;i++){
            if(nums[flg]!=nums[i]){
                nums[++flg]=nums[i];
            }
        }
        return ++flg;
    }
}