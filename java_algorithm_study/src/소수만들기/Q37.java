package 소수만들기;



public class Q37 {
    public static void main(String [] args){
        System.out.println(solution(new int[] {1,2,7,6,4}));

    }
    public static int solution(int[] nums) {
        int answer = 0;

        for(int i =0 ; i < nums.length -2 ; i++){
            for(int j = i+1 ; j < nums.length -1 ; j++ ){
                for(int k = j+1 ; k < nums.length ; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(is_prime(sum) == true){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
    public static boolean is_prime(int a){
        int num =0;
        for(int i =1 ; i <= a ; i++){
            if(a % i ==0){
                num++;
            }
        }
        if(num ==2){
            return true;
        }else{
            return false;
        }
    }

}
