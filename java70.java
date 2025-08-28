public class java70 {

    public static int climbStairs(int n) {
        int result = 0;
        int x = 1;
        int y = 2;
        if (n <= 2) {
            result = n;
        } else {
            for (int i = 3; i <= n; i++) {
                result = x + y;
                x = y;
                y = result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println('\n');
        System.out.println(climbStairs(4));
        System.out.println('\n');
    }
}