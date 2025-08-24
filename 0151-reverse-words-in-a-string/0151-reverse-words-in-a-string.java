class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while(i<s.length()){
            StringBuilder sb = new StringBuilder();
            while(i<s.length() && (s.charAt(i)!=' ')){
                sb.append(s.charAt(i));
                i++;
            }
            if(sb.length()>0){
                list.add(sb.toString());
            }
             while(i<s.length() && s.charAt(i)==' '){
                    i++;
                }
            }
        
        StringBuilder res = new StringBuilder();
        for (int j = list.size() - 1; j >= 0; j--) {
            res.append(list.get(j));
            if (j > 0) res.append(" ");
        }

        return res.toString();
        
    }
}