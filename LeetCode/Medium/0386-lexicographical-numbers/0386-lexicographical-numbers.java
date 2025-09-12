class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(Integer.toString(i));
        }
        Collections.sort(list);
        ArrayList<Integer> res = new ArrayList<>();
        for(String i : list) res.add(Integer.parseInt(i));
        return res;
    }
}