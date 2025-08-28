
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class java136 {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (countMap.get(num) == 1) {
                singleNumber = num;
            }

        }

        return singleNumber;

    }

}
