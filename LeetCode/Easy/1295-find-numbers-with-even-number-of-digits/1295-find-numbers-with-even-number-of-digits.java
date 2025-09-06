class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
            int dig = String.valueOf(n).length();
            if(dig%2==0) count++;
        }
        return count;
    }
}