
public class java168 {

    public static String converToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            sb.append((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 26;
        System.out.println('\n');
        System.out.println(converToTitle(n));
    }
}
