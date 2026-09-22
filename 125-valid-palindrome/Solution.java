class Solution {
    public boolean isPalindrome(String s) {
        //check for empty

        return false;
    }
        String rev = new StringBuilder(s).reverse().toString();
        
        if (s.equals(rev)) return true;
      
        //rev code
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");;
}