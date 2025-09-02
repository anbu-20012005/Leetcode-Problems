class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int length = 1; i + length <= n; length += 2) {
                for (int k = i; k < i + length; k++) {
                    sum += arr[k];
                }
            }
        }

        return sum;
    }
}
