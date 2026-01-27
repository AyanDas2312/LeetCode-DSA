class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> lr = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]<min){
                min=arr[i]-arr[i-1];
                lr.clear();
                lr.add(Arrays.asList(arr[i-1],arr[i]));
            }else if(Math.abs(arr[i]-arr[i-1])==min){
                lr.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return lr;
    }
}