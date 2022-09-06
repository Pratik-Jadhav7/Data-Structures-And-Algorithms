class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int len1 = word1.length();
        int len2 = word2.length();
        char[] ch = new char[len1+len2];
        while(i<len1 && j<len2){
            ch[i+j] = word1.charAt(i++);
            ch[i+j] = word2.charAt(j++);
        }
        
        while(i<len1){
            ch[i+j] = word1.charAt(i++);
        }
        
        while(j<len2){
            ch[i+j] = word2.charAt(j++);
        }
        
        return new String(ch);
    }
}
