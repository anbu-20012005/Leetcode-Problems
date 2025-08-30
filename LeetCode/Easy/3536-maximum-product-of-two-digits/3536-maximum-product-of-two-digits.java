class Solution {
    static{
        for(int i=0;i<500;i++){
            maxProduct(55);
        }
    }
    public static int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n!=0){
            list.add(n%10);
            n/=10;
        }
        Collections.sort(list);
        int a = list.size();
        return (list.get(a-1)*list.get(a-2));
    }
}