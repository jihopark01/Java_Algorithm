package 숫자문자열과영단어;

public class Q38 {
    public static void main(String [] args){
        System.out.println(solution("2three45sixseven"));

    }
    public static int solution(String s) {
        int answer = 0;
        String [] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i =0 ; i < 10 ; i++){
            s= s.replace(num[i],Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
