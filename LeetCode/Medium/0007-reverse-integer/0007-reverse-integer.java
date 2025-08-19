class Solution {
    public int reverse(int x) {
        int y=x;
        if(x<0) 
        y = x*-1;
        String res = Integer.toString(y);
        StringBuilder str = new StringBuilder();
        str = str.append(res);
        str = str.reverse();
        res = str.toString();
        int fin;
        try{
        fin = Integer.parseInt(res);
        }catch(NumberFormatException e){
            return 0;
        }
        
        if(x<0) fin = fin*-1;

        return fin;
    }
}