package 두정수사이의합;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(solution(5,3));

    }

    public static long solution(int a, int b) {
        long sum = 0;
        if (a < b) {
            for (int i = a; i < b + 1; i++) {
                sum += (long) i;
            }
        } else if (a == b) {
            sum = a;
        } else {
            for (int i = b; i < a + 1; i++) {
                sum += (long) i;
            }
        }
        return sum;
    }
}
