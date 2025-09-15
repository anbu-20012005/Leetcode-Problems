class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        for(String s : text.split(" ")){
            boolean flag = true;
            for(char ch : brokenLetters.toCharArray()){
                if(s.contains(ch+"")){
                    flag = false;
                    break;
                }
            }
            if(flag==true) count++;
        }
        return count;
    }
}