package 가운데글자가져오기;

public class Q3 {
    public static void main(String [] args){
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));

    }
    public static String solution(String s) {
        String answer = "";
        int len = s.length()/2;
        if(s.length() %2 == 1){
            answer += s.charAt(len);
        }else {
            answer += s.charAt(len-1);
            answer += s.charAt(len);
        }

        return answer;
    }
}
