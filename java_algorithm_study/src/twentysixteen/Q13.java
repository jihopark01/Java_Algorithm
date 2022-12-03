package twentysixteen;

public class Q13 {
    public static void main(String[] args) {
        System.out.println(solution(5,24));

    }

    public static String solution(int a, int b) {
        String ans = "";
        int[] days = {30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totaldate = 0;
        for (int i = 0; i < a - 1; i++) {
            totaldate += days[i];
        }
        totaldate += b;
        int day = totaldate % 7;
        switch (day) {
            case 0:
                ans = "FRI";
                break;

            case 1:
                ans = "SAT";
                break;

            case 2:
                ans = "SUN";
                break;
            case 3:
                ans = "MON";
                break;
            case 4:
                ans = "TUE";
                break;
            case 5:
                ans = "WED";
                break;
            case 6:
                ans = "THU";
                break;
        }
        return ans;
    }

}
