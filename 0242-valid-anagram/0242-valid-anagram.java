class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        Arrays.sort(s1);
        String sorteds1=new String(s1);
        char[] t1=t.toCharArray();
        Arrays.sort(t1);
        String sortedt1=new String(t1);
        return sorteds1.equals(sortedt1);
    }
}