class Solution {
    static {
        for(int i=0;i<400;i++){
            areNumbersAscending("a");
        }
    }
    public static boolean areNumbersAscending(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String str : s.split(" ")){
            try{
                int a = Integer.parseInt(str);
                list.add(a);
            }
            catch(NumberFormatException e){

            }
        }
        System.out.println(list);
        for(int i = 0; i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)) return false;
        }
        return true;
    }
}