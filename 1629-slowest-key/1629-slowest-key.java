class Solution {
    public char slowestKey(int[] rel, String key) {
        char ans = key.charAt(0);
        int max = rel[0];
        for(int i=1;i<rel.length;i++){
            int diff = Math.abs(rel[i-1]-rel[i]);
            if(diff>max || (diff == max && key.charAt(i)>ans)){
                max = diff;
                ans = key.charAt(i);
            }
        }
        return ans;
    }
}