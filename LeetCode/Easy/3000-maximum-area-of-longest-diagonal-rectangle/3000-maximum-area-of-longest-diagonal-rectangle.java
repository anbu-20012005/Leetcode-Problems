class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int maxArea = 0;
        int maxDig = 0;
        for(int i=0;i<n;i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int curr = l*l+w*w;

            if(curr>maxDig || (curr==maxDig && l*w>maxArea)){
                maxDig = curr;
                maxArea = l*w;
            }
        }
    return maxArea;
    }
}