class Solution {
    public boolean isPalindrome(int x) {
        int m=0,r=0;
        int y=x;
        if (x<0){
            return false;
        }
        while (x>0){
            r=x%10;
            m=m*10+r;
            x=x/10;    
        }
        if (m==y) return true;
        return false;    
    }
}