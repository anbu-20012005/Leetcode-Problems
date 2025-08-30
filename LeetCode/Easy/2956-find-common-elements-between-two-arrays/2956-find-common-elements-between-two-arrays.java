class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans2 = 0;
        int ans1 = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums1) set1.add(i);
        for(int i : nums2) set2.add(i);

        for(int i : set1){
            for(int j : nums2){
                if(i==j) ans1++;
            }
        }
        for(int i : set2){
            for(int j : nums1){
                if(i==j) ans2++;
            }
        }
        return new int[]{ans2,ans1};
    }
}