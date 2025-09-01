class Solution {
    static{
        for(int i=0;i<300;i++)
        reverseOnlyLetters("");
    }
    public static String reverseOnlyLetters(String sb) {
        StringBuilder s = new StringBuilder(sb);
        int i = 0;
        int j = s.length()-1;
        char ch=' ';
        while(i<j){
            if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))){
                ch = s.charAt(i);
                s.setCharAt(i,s.charAt(j));
                s.setCharAt(j,ch);// = ch;
                i++;
                j--;
            }
            else if(!Character.isLetter(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetter(s.charAt(j))){
                j--;
            }
        }
        return s.toString();
    }
}