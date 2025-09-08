class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int arr1[] = new int[4];
        int arr2[] = new int[14];
        for(int i=0; i<5; i++) arr2[ranks[i]]++;
        for(int i=0; i<5; i++) arr1[suits[i]-'a']++;

        int a = 0;
        int b = 0;
        for(int i=1; i<14; i++) a = Math.max(a,arr2[i]);
        for(int i=0; i<4; i++) b = Math.max(b,arr1[i]);

        if(b==5){
            return "Flush";
        }else if(a>=3){
            return "Three of a Kind";
        }else if(a>=2){
            return "Pair";
        }else return "High Card";
    }
}