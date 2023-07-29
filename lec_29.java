// Anagrams---------------------------------------------------
public class lec_29 {
    static boolean isanagram(String s1, String s2){
        // if length is not equal, then anagram is not possible
        if(s1.length() != s2.length()) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int n = s1.length();
        int freqarr[] = new int[26];
        int freqarr2[] = new int[26];
        
        // in freqarr, 0 means 'a' and 25 means 'z'
        for(int i = 0; i < n; i++){
            // for string s1
            int index1 = s1.charAt(i) - 'a';
            freqarr[index1]++;
            // for string s2
            int index2 = s2.charAt(i) - 'a';
            freqarr2[index2]++;
        }
        
        for(int i = 0; i < 26; i++){
            if(freqarr[i] != freqarr2[i]) return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isanagram("cat", "atc"));       // true
        System.out.println(isanagram("batman", "manbat")); // true
        System.out.println(isanagram("supercar", "racsuper")); // true
    }
}
