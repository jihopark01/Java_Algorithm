package 음양더하기;

public class Q7 {
    public static void main(String [] args){


    }
    public static int solution(int[] absolutes, boolean[] signs) {
        int sum =0;
        for(int i =0; i < absolutes.length; i++){
            if(signs[i] == true){
                sum += absolutes[i];
            }else{
                sum -= absolutes[i];
            }
        }
        return  sum;
    }
}
