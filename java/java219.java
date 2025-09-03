import java.util.HashMap;
import java.util.Map;

public class java219 {
    public static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> maps = new HashMap<>();

            for(int i = 0; i < nums.length; i++){
                int val = nums[i];
                if(maps.containsKey(val)){
                    int prevIndex = maps.get(val);
                    if(Math.abs(prevIndex-i)<= k){
                        return true;
                    } 
                }
                maps.put(val, i );
                
            }
            return false;

            
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        Solution sol = new Solution();

        System.out.println("'\n");
        System.out.println("result ist " + sol.containsNearbyDuplicate(nums, k));


    }

}
