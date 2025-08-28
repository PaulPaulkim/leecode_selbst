import java.util.Map;
import java.util.HashMap;

public class java169 {
    static class Solution{
        public int majorityElement(int[] nums){
            Map<Integer , Integer> countMap = new HashMap<>();
            
            for(int num : nums){
                countMap.put(num, countMap.getOrDefault(num,0)+1);
            }

            int majority= -1;
            int maxCount = 0;

            for(Map.Entry<Integer, Integer> entry : countMap.entrySet() ){
                int num = entry.getKey();
                int cnt = entry.getValue();

                if(cnt > maxCount){
                    maxCount = cnt;
                    majority = num;
                }
            }

            return majority;
        }
    }

    public static void main(String[] args) {
        int num[] = {1,1,1,2,2};

        Solution sl = new Solution();
        System.out.println('\n');
        System.out.println(sl.majorityElement(num));

    }
}
