import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class java205 {
    public static class Solution{
        public boolean isIsomorphic(String s, String t){
            if(s.length() == 1 && t.length() ==1){
                return true;
            } 
            if(s.length() != t.length()) {
                return false;
            }
            Map<Character, Integer> pos1 = new HashMap<>();
            Map<Character, Integer> pos2 = new HashMap<>();
            int[] out1 = new int[s.length()];
            int[] out2 = new int[t.length()];
            int next = 0;
            for(int i = 0; i< s.length(); i++){
                char c = s.charAt(i);
                if(!pos1.containsKey(c)){
                    pos1.put(c,next);
                    next++;
                }
                out1[i] = pos1.get(c);
            }
            next = 0;
            for(int i = 0; i< t.length(); i++){
                char c = t.charAt(i);
                if(!pos2.containsKey(c)){
                    pos2.put(c,next);
                    next++;
                }
                out2[i] = pos2.get(c);
            }
            return Arrays.equals(out1, out2);
        }
        public static void main(String[] args) {
            String s = "abb";
            String t = "abc";

            Solution sol = new Solution();
            System.out.println('\n');
            System.out.println("result ist " + sol.isIsomorphic(s, t));
        }
    }
}
