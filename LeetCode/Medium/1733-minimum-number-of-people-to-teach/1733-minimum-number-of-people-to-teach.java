class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        List<Set<Integer>> lang = new ArrayList<>();
        for(int[] lan : languages){
            Set<Integer> set = new HashSet<>();
            for(int na : lan){
                set.add(na);
            }
            lang.add(set);
        }
        
        Set<Integer> users = new HashSet<>();
        for(int[] f : friendships){
            int u = f[0]-1;
            int v = f[1]-1;
            boolean cancom = false;
            for(int lan : lang.get(u)){
                if(lang.get(v).contains(lan)){
                    cancom = true;
                    break;
                }
            }
            if(!cancom){
                users.add(u);
                users.add(v);
            }
        }
        if(users.isEmpty()) return 0;
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            int count = 0;
            for(int l : users){
                if(!lang.get(l).contains(i)){
                    count++;
                }
            }
            min = Math.min(min,count);
        }
        return min;
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           