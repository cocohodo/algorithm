class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        if (ransomNote.length()> magazine.length()){return false;}
        for (int a=0;a<magazine.length();a++) {
            alphabet[magazine.charAt(a)-97]++;
        }
        for (int b=0;b<ransomNote.length();b++) {
            if(alphabet[ransomNote.charAt(b)-97]==0) return false;
            alphabet[ransomNote.charAt(b)-97]--;
        }
        return true;
    }
}