public class java125 {
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","");
        String lower = cleaned.toLowerCase();
        int left = 0;
        int right = lower.length()-1;

        while(left<right){
            if(lower.charAt(left)!=lower.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama ";

        System.out.println(isPalindrome(s));
    }

}
