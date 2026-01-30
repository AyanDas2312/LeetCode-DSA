class Solution {
    public int thirdMax(int[] nums) {
       TreeSet<Integer> set = new TreeSet<>();
       for(int i : nums){
        set.add(i);
        if(set.size()>3){
            set.pollFirst();
        }
       }
       return set.size() == 3 ? set.first() : set.last();
    }
}