class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        int c = Math.max(a.length(),b.length());
        return c;
    }
}