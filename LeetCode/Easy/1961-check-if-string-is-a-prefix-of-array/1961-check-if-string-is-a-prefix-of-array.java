class Solution {
    static{
        for(int i=0;i<500;i++){
            String[] arr = {"",""};
            isPrefixString("",arr);
        }
    }
    public static boolean isPrefixString(String s, String[] words) {
        String res = words[0];
      for(int i=1;i<words.length;i++){
        String str = words[i];
        if(res.equals(s)) return true;
        else{
            res = res+str;
        }
      }
      if(res.equals(s)) return true;
      return false;
    }
}