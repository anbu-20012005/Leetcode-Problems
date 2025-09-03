class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        int n = code.length;
        if(k==0) Arrays.fill(arr,0);
        else if(k>0){
            for(int i=0;i<code.length;i++){
                int sum = 0;
                for(int j=i+1;j<=k+i;j++){
                    sum = sum + code[j%code.length];
                }
                arr[i]=sum;
            }
        }
        else{
            k = -k;
            for(int i=0;i<code.length;i++){
                int sum = 0;
                for(int j=i-k;j<i;j++){
                    sum = sum + code[(j+n)%n];
                }
                arr[i]=sum;
            }
        }
        return arr;
    }
}