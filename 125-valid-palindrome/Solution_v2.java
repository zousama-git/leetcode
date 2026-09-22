class Solution {
    public boolean isPalindrome(String s) {

        return false;
    }
        String rev = new StringBuilder(s).reverse().toString(); 
        if (s.equals(rev)) return true;

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");;
               
}