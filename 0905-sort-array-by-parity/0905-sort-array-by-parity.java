class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 0, p = nums.length-1;
        for(int i : nums){
            if(i%2==0){
                arr[l]=i;
                l++;
            }
            else{
                arr[p]=i;
                p--;
            }
        }
        return arr;
    }
}