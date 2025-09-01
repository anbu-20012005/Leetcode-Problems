class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(list.size()<arr.length){
            if(arr[i]!=0){
                list.add(arr[i]);
                i++;
            }
            else{
                list.add(0);
                list.add(0);
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        //System.out.println(list);
    }
}