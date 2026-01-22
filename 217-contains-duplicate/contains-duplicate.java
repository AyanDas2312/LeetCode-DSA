class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dup = new HashMap<>();
        for (int num : nums) {
            dup.put(num, dup.getOrDefault(num, 0) + 1);
        }
        int count=0;
        for(int key : dup.keySet()){
            if(dup.get(key)>1){
                count++;
            }
        }
        if(count>0){
            return true;
        }
        return false;
    }
}