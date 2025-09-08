class Solution {
    static{
        for(int i=0;i<100;i++)
        secondHighest("");
    }
    public static int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)) set.add(ch-'0');
        }
        if(set.size()<2) return -1;
        for(int i : set) list.add(i);
        Collections.sort(list);
        return list.get(list.size()-2);
    }
}