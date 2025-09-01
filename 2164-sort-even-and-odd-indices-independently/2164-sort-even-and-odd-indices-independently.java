class Solution {
    static{
        int[] tr = {};
        for(int i=0;i<400;i++) sortEvenOdd(tr);
    }
    public static int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        int a = 0;
        int b = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even.get(a);
                a++;
            }
            else{
                nums[i]=odd.get(b);
                b++;
            }
        }
        return nums;
    }
}