public class java171 {
    static class Solution{
        public int titleToNumber(String columnTitle){
            int result = 0;
            for(int i = 0; i< columnTitle.length(); i++){
                char c = columnTitle.charAt(i);
                int value = c - 'A' +1;

                result = result *26 + value;
                
            }

            return result;
        }
    }

    public static void main(String[] args) {
        String s = "AB";

        Solution sol = new Solution();

        System.out.println('\n');

        System.out.println(sol.titleToNumber(s));


    }
}
