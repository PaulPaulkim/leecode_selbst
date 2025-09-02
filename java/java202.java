import java.util.HashSet;
import java.util.Set;

public class java202 {
    public static class solution {

        public int sumOfSquares(int n){
            int result = 0;
            while(n >0){
                int rest = n % 10;
                
                result += rest*rest;

                n /= 10;
            }

            return result;
        }

        public boolean isHappy(int n) {
            Set<Integer> seen = new HashSet<>();
            
            while( n!= 1){
                if(seen.contains(n)){
                    return false;
                }else{
                    seen.add(n);

                    n = sumOfSquares(n);
                }
            }
            return true;            
        }
    }

    public static void main(String[] args) {
        int n = 100;

        solution sol = new solution();
        System.out.println('\n');

        System.out.println("result is " + sol.isHappy(n));

    }
}
