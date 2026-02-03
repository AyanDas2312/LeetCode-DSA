class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length < 4) return false;
        int phase = 0;
        // 0 -> increasing
        // 1 -> decreasing
        // 2 -> again increasing
        if (nums[0] >= nums[1]) return false;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) return false;
            if(nums[i] < nums[i+1]){
                if(phase == 1){
                    phase = 2;
                }else if(phase == 2){}
            }
            else{
                if(phase == 0){
                    phase = 1;
                }else if(phase == 2){
                    return false;
                }
            }
        }
        return phase == 2;
    }
}