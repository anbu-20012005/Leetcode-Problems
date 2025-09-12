class Solution {
    public boolean doesAliceWin(String s) {
        String vow = "AEIOUaeiou";
        int count = 0;
        for(char ch : s.toCharArray()){
           switch(ch){
            case 'a','e','i','o','u':
            return true;
           } 
        }
        return false;

    }
}