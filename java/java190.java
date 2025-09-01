public class java190{
    public static class Solution{
        public int reverseBits(int n){
            int result;
            //to bin
            String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

            //reverse;
            String flipped = new StringBuilder(binary).reverse().toString();

            result = Integer.parseInt(flipped,2);
            //wieder dezimal
           return result;
        }
    }

    public static void main(String[] args) {
        int n = 43261596;

        Solution sol = new Solution();

        int result = sol.reverseBits(n);

        System.out.println('\n');

        System.out.println(result);

    }
}