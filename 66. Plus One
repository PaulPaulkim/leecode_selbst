public class java66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[length+1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] bs = { 1,2,3 };

        java66 out = new java66();

        int[] result = out.plusOne(bs);

        System.out.println('\n');
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println('\n');

    }
}
