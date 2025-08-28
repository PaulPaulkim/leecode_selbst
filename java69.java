public class java69 {

    class Solution{
        public int mySqrt(int x){
            int result;
            int i= 0;
            while((long)i*i <= x){
                i+=1;
            }
            result = i-1;

            return result;
        }
    }
    public static void main(String[] args) {
        

        java69 outer = new java69();
        Solution sol = outer.new Solution();
        int x = 16;


        System.out.println('\n');
        System.out.println(sol.mySqrt(x));
        System.out.println('\n');
        
    }
}
