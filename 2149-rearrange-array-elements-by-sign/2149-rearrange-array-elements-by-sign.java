class Solution {
    static{
        int[] a = {};
        for(int i=0;i<500;i++) rearrangeArray(a);
    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int p = 0;
        int ne = 0;
        for(int i = 0; i<n;i++){
            if(nums[i]>=0){
                pos[p]=nums[i];
                p++;
            }
            else{
                neg[ne]=nums[i];
                ne++;
            }
        }
        p = 0;
        ne = 0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[p];
                p++;
            }
            else{
                nums[i]=neg[ne];
                ne++;
            }
        }
        return nums;
    }
}