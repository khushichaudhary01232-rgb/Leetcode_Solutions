class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c) && c!=' '){
                sb.append(Character.toLowerCase(c));
            }
        }
        String t=sb.toString();
        String f=sb.reverse().toString();
        if (t.equals(f)){
            return true;
        }
        return false;     
    }
}