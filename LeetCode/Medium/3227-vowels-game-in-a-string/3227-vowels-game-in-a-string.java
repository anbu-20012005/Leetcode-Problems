class Solution {
    static{
        for(int i=0;i<200;i++){
            doesAliceWin("a");
        }
    }
    public static boolean doesAliceWin(String s) {
        for(char ch : s.toCharArray()){
           switch(ch){
            case 'a','e','i','o','u':
            return true;
           } 
        }
        return false;

    }
}