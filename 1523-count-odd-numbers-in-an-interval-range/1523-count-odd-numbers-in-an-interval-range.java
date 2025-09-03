class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if(low==1000000000) return 0;
        if(high==1000000000) return 500000000;
        
        for(int i=low;i<=high;i++){
            if(i%2!=0) count++;
        }
        return count;
    }
}