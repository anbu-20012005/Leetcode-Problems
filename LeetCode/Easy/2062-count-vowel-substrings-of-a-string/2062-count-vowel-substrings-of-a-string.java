class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        for(int i=0;i<word.length();i++){
            Set<Character> set = new HashSet<>();
            for(int j=i;j<word.length();j++){
                if(isvow(word.charAt(j))==true){
                    set.add(word.charAt(j));
                    if(set.size()==5) count++;
                }
                else break;
            }
        }
        return count;
    }
    public static boolean isvow(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}