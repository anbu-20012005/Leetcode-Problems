class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int i = 0;
        for(String str : arr){
            StringBuilder sb = new StringBuilder(str);
            arr[i] = sb.reverse().toString();
            i++;
        }
        String res = "";
        for(int j=0;j<arr.length;j++){
            res = res + arr[j] + " ";
        }
        return res.trim();
    }
}