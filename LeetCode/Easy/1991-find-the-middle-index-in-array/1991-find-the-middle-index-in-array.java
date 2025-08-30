class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
        pre[0] = 0;
        for(int i=1;i<nums.length;i++){
            pre[i] = nums[i-1]+pre[i-1];
        }
        suff[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            suff[i] = nums[i+1]+suff[i+1];
        }
        suff[n-1] = 0;
        for(int i=0;i<n;i++){
            if(suff[i]==pre[i]) return i;
        }
        return -1;
    }
}