class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int max = -1;
            for(int j=0;j<nums.length;j++){
                if(nums[i]<nums[(j+i)%nums.length]){
                    max = nums[(j+i)%nums.length];
                    break;
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}