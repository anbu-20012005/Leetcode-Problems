class Solution {
    public int[] minOperations(String boxes) {
        char[] arr = boxes.toCharArray();
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[j]=='1'){
                        sum+= Math.abs(i-j);
                    }
                }
            }
            System.out.println(sum);
            res[i] = sum;
        }
        return res;
    }
}