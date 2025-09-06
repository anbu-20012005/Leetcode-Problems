class Solution {
    public String generateTheString(int n) {
        String str = "";
        for(int i=0;i<n-1;i++){
            str = str+"a";
        }
        if(n%2==1){
            return str+"a";
        }
        else{
            return str+"n";
        }
        
    }
}