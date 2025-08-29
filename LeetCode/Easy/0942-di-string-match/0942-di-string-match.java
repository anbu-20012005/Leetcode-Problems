class Solution {
    public int[] diStringMatch(String s) {
        int[] arr = new int[s.length()+1];
        int st = 0;
        int end = s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=st;
                st++;
            }
            else{
                arr[i]=end;
                end--;
            }
        }
        if(s.charAt(s.length()-1)=='D')
        arr[arr.length-1]=end;
        else
        arr[arr.length-1]=st;
        return arr;
    }
}