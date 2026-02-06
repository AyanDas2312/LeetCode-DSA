class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                current++;
                max = Math.max(max, current);
            }else if(nums[i]==0){
                current=0;
            }else{
                return -1;
            }
        }
        return max;
    }
}