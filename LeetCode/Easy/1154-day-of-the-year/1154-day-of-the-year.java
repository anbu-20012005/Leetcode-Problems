class Solution {
    public int dayOfYear(String date) {
        int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] d = date.split("-");
        int mon = Integer.parseInt(d[1]);
        if(isleap(Integer.parseInt(d[0]))) arr[2] = 29;
        int sum = 0;
        for(int i=1;i<mon;i++){
            sum = sum + arr[i];
        }
        sum = sum + Integer.parseInt(d[2]);
        return sum;
    }
    public boolean isleap(int a){
        if(a%400==0) return true;
        if(a%4==0 && a%100!=0) return true;
        return false;
    }
}