class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(m == 0){
            return 0;
        }
        for(int i=0;i<=m-n;i++){
            int count = 0;

            while(count < n && haystack.charAt(i+ count) == needle.charAt(count)){
                count++;
            }
            if(count == n){
                return i;
            }
        }
        return -1;
    }
}