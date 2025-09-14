class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<String> set = new HashSet<>();
        HashMap<String, String> lower = new HashMap<>();
        HashMap<String, String> vow = new HashMap<>();
        for (String s : wordlist) {
            set.add(s);
            lower.putIfAbsent(s.toLowerCase(), s);
            vow.putIfAbsent(decodevow(s.toLowerCase()), s);
        }
        String[] ans = new String[queries.length];
        int a = 0;
        for(String s : queries){
            if(set.contains(s)){
                ans[a] = s;
                a++;
                continue;
            }
            String low = s.toLowerCase();
            if(lower.containsKey(low)){
                ans[a] = lower.get(low);
                a++;
                continue;
            }
            String devow = decodevow(low);
            if(vow.containsKey(devow)){
                ans[a] = vow.get(devow);
                a++;
                continue;
            }
            ans[a] = "";
            a++;
        }
        return ans;
    }

    public String decodevow(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ans.append("*");
            } else
                ans.append(ch);
        }
        return ans.toString();
    }
}