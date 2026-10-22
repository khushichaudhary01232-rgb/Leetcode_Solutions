class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        String str=new String();
        for(int i=n-1;i>=0;i--){
            int d = num.charAt(i)-'0';
            if ((d%2)!=0){
                str=num.substring(0,i+1); 
                break;
            }
        }
        return str;    
    }
}