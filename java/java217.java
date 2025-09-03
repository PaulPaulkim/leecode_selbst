import java.util.HashMap;
import java.util.Map;

public class java217 {
    static class Solution{
        public boolean containsDuplicate(int[] nums){
            Map<Integer, Integer> maps = new HashMap<>();
            
            for(int i = 0; i< nums.length; i++){
                int val = nums[i];
                int zahl = 0;
                if(maps.containsKey(val)){
                    return true;
                }else{
                    maps.put(val, zahl);
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        Solution sol = new Solution();

        System.out.println('\n');
        System.out.println("result ist " + sol.containsDuplicate(array));

    } 
}
