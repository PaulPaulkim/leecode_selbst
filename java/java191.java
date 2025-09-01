public class java191{

    public static class Solution{
        public int hammingWeight(int n){

            int result = 0;
            
            String binary = Integer.toBinaryString(n);

            for(int i = 0; i< binary.length(); i++ ){
                char c = binary.charAt(i);

                if( c == '1'){
                    result +=1;
                }

            }
            return result;
        }

        public static void main(String[] args) {
            int n = 2147483645;

            Solution sol = new Solution();

            System.out.println('\n');

            System.out.println("result ist "+ sol.hammingWeight(n));
        }
    }
}