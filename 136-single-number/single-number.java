class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> singleNum = new HashMap<>();
        for(int i : nums){
            singleNum.put(i,singleNum.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> en : singleNum.entrySet()){
            if(en.getValue() == 1){
                return en.getKey();
            }
        }
        return -1;
    }
}