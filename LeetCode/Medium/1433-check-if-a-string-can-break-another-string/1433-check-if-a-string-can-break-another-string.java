class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr = s1.toCharArray();
        char[] arrr = s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arrr);
        boolean flag1 = true;
        boolean flag2 = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arrr[i]){
                flag1 = false;
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arrr[i]<arr[i]){
                flag2 = false;
                break;
            }
        }
        return flag1 || flag2;
    }
}