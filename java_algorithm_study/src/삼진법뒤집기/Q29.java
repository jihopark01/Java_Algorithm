package 삼진법뒤집기;
import java.lang.Math;
import java.lang.StringBuilder;

public class Q29 {
    public static void main(String [] args){
        System.out.println(solution(45
        ));

    }
    public  static long solution(int n) {
        int answer = 0;
        String num = "";

        while(n >0) {
            num += n%3;
            n /= 3;
        }
        StringBuilder sb = new StringBuilder(num);
        String str = sb.reverse().toString();
       String [] arr = str.split("");
        for(int i =0; i <num.length(); i++){
            answer += Integer.parseInt(arr[i]) * Math.pow(3,i);
        }
        return answer;
    }
}
