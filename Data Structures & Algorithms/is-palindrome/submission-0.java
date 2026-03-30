class Solution {
    public boolean isPalindrome(String s) {
        String reversed = "";

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z-0-9]", "");

        for(int i = s.length()-1; i>=0; i--){
            reversed += s.charAt(i);
        }
        if(reversed.equals(s)){
            return true;
        }else{
            return false;
        }
    }
}