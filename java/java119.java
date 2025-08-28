import java.util.ArrayList;
import java.util.List;

public class java119 {
    public List<Integer> getRow(int rowIndex){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        
        for(int i = 1; i< rowIndex; i++){
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for(int j = 1; j< result.size(); j++){                
                int sum = result.get(j) + result.get(j-1);
                current.add(sum);
            }
            current.add(1);
            result = current;
        }
        return result;
    }
}
