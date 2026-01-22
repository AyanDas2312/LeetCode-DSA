class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dup = new HashMap<>();
        for (int num : nums) {
            dup.put(num, dup.getOrDefault(num, 0) + 1);
        }
        for(int key : dup.keySet()){
            if(dup.get(key)>1){
                return true;
            }
        }
        return false;
    }
}