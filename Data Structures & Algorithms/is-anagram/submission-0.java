class Solution {
    public boolean isAnagram(String s, String t) {
        char[] Strings = s.toCharArray();
        char[] Stringt = t.toCharArray();
        Arrays.sort(Strings);
        Arrays.sort(Stringt);
        String sorted_s = new String(Strings);
        String sorted_t = new String(Stringt);
            if(sorted_s.equals(sorted_t)){
                 return true;
            }
            else{
                return false;
            }
    }
}
