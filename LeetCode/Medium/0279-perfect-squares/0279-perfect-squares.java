class Solution {
    public int numSquares(int n) {
        if(per(n)) return 1;
        for(int i=1;i*i<=n;i++){
            int rem = n - (i*i);
            if(per(rem)){
                return 2;
            }
        }
        
        int temp = n;
        while(temp % 4 == 0){
            temp/=4;
        }
        if(temp%8 != 7){
            return 3;
        }
        else return 4;
    }
    public boolean per(int n){
        int low = 1, high = n/2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((long)mid*mid>n) high = mid-1;
            else if((long)mid*mid<n) low = mid+1;
            else return true;
        }
        return false;
    }
}
 