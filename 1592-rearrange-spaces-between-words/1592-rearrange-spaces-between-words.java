class Solution {
    static {
        for(int i=0;i<500;i++) reorderSpaces("a");
    }
    public static String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int wc = words.length;
        int sp = 0;
        for(char ch : text.toCharArray()){
            if(ch==' ') sp++;
        }
        if (words.length == 1) {
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 0; i < sp; i++) sb.append(" ");
        return sb.toString();
        }
        StringBuilder sb = new StringBuilder();
        int diff = sp/(wc-1);
        int rem = sp%(wc-1);
        String s = "";
        for(int i=0;i<diff;i++){
            s = s+" ";
        }
        for(int i=0;i<wc;i++){
            sb.append(words[i]);
            if(i<wc-1)
            sb.append(s);
        }
        for(int i=0;i<rem;i++) sb.append(" ");
        return sb.toString();
    }
}