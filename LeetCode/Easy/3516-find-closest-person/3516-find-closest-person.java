class Solution {
    public int findClosest(int x, int y, int z) {
        int p1diff = Math.abs(z-x);
        int p2diff = Math.abs(z-y);
        if(p1diff<p2diff) return 1;
        else if(p2diff<p1diff) return 2;
        else return 0;
    }
}