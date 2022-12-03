package 핸드폰번호가리기;

public class Q9 {
    public static void main(String [] args){
        System.out.println(solution("01033334444"));

    }
    public static String solution(String num) {
       int len = num.length();
       String answer ="";
       String star= "*".repeat(len -4);
       String nonstar = num.substring(len-4);
       answer += star;
       answer += nonstar;
       return  answer;
    }
}
