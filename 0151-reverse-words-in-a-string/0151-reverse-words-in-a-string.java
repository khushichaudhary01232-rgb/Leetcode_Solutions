class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String S=s.trim().replaceAll("\\s+"," ");
        int n = S.length();
        int ws = 0;
        for (int i=0;i<n;i++){
            if (S.charAt(i)==' ' || i==n-1){
                String word = i==n-1? S.substring(ws):S.substring(ws,i);
                sb.insert(0,word+" ");
                ws=i+1;
            }
        } 
        String s1 = sb.toString().trim();
        return s1;       
    }
}