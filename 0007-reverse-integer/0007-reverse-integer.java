class Solution {
    public int reverse(int x) {
        int r=0,m=0;
        while (x!=0){
            r=x%10;
            if (m>Integer.MAX_VALUE/10 || m==Integer.MAX_VALUE/10 &&r>7)     return 0;
            if (m<Integer.MIN_VALUE/10 || m==Integer.MIN_VALUE/10 && r<-8) return 0; 
            m=m*10+r;   
            x=x/10;
        }
        if (x<0) return -m;
        return m ;    
    }
}