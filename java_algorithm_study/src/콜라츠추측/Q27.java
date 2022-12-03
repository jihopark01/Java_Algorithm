package 콜라츠추측;

public class Q27 {
    public static void main(String[] args) {
        System.out.println(solution(626331));

    }
    public static int solution(int num) {
        int i = 1;
        int answer =0;
        while(num  >= 1){

            if(i > 500){
                answer = -1; break;
            }else{
                if(num != 1 ){
                    if(num %2 ==0){
                        num = num/2;
                    }else{
                        num = 3 *num +1 ;
                    }
                }else{
                    answer = i;
                }
                i++;
            }
        }
        return  answer;
    }

}