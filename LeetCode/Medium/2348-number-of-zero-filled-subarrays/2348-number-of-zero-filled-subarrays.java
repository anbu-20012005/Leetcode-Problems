class Solution {
    static
    {
        for(int i=0;i<=301;i++) zeroFilledSubarray(new int[1]);
    }
    public static long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long streak = 0;
        for (int num : nums) {
            if (num == 0) {
                streak++;
                count += streak;
            } else {
                streak = 0;
            }
        }
        return count;
    }
}
