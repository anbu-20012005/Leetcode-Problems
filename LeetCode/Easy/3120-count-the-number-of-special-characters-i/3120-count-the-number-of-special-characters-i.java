class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();

        for(char c : word.toCharArray()){
            if(Character.isLowerCase(c)){
            c = Character.toUpperCase(c);
            if(word.contains(String.valueOf(c))) set.add(c);
            }
        }
        System.out.println(set);
        return set.size();
    }
}