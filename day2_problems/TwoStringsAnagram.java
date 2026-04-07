import java.util.*;
class TwoStringsAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> set1= new HashMap<>();
        Map<Character, Integer> set2= new HashMap<>();
        for(char c: s.toCharArray()){
            set1.put(c, set1.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            set2.put(c, set2.getOrDefault(c,0)+1);
        }

        if(set1.equals(set2)){
            return true;
        }
        return false;

        
    }
}