package 하샤드수;

public class Q28 {
    public static void main(String [] args){
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));

    }
    public static boolean solution(int x) {
        boolean answer = true;

        int sum =0 ;
        String[] s = String.valueOf(x).split("");
        for(int i=0; i< s.length; i++){
            sum += Integer.parseInt(s[i]);
        }
        if(x % sum ==0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
     }
}
