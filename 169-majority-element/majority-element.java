class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i : nums){
            frequencyMap.put(i, frequencyMap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue() > Math.floor(nums.length/2)){
                return entry.getKey();
            }
        }
        return -1;
    }
}