class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        int sum = 0;
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i : freq){
            if(i==0) continue;
            if(i%2==0) sum+=2;
            else sum+=1;
        }
        return sum;
    }
}