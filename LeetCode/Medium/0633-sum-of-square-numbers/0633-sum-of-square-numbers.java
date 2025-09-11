class Solution {
    public boolean judgeSquareSum(int c) {
        Long j = (long)Math.sqrt(c);
        int i = 0;
        while(i<=j){
            Long sum = (i*i)+(j*j);
            if(sum==c) return true;
            else if(sum>c) j--;
            else i++;
        }
        return false;
    }
}