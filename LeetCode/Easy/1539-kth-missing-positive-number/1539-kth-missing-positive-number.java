class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 1;
        int i = 0;

        while (list.size() < k) {
            if (i < arr.length && arr[i] == target) {
                i++; // skip if the number exists in arr
            } else {
                list.add(target); // missing number found
            }
            target++;
        }

        return list.get(k - 1); // kth missing number
    }
}
