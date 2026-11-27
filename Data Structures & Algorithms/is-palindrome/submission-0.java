class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int r = s.length() - 1;
        while (i < r) {
            while (i < r && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            // Convert both characters to lowercase
            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(r));

            // Compare both charcters 
            if( left != right){
                return false;
            }
            i = i + 1;
            r = r - 1;

    }
    return true;
}
}
