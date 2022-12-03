package 모의고사;


import java.util.*;



public class Q34 {
    public static void main(String [] args){
        System.out.println(solution(new int[]{1,2,3,4,5}));

    }
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int num1 =0;
        int num2 = 0;
        int  num3= 0 ;
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int [] arr3 = {3,3,1,1,2,2,4,4,5,5};
        for (  int i =0 ; i < answers.length ; i++ ){
            if(answers[i] == arr1[i%5]){
                num1 ++;
            }
        }
        for (  int i =0 ; i < answers.length ; i++ ){
            if(answers[i] == arr2[i%8]){
                num2 ++;
            }
        }
        for (  int i =0 ; i < answers.length ; i++ ){
            if(answers[i] == arr3[i%10]){
                num3 ++;
            }
        }
       int  [] nums = new int []{num1, num2, num3};
        Arrays.sort(nums);
        for(int i =0; i <3 ;i++){
            nums[i] = nums[2-i];
        }

        if(nums[0] == nums[1] && nums[1] == nums[2]){
            answer = new int[]{1, 2, 3};
        }else if(nums[0] == nums[1]){
            answer = new int[]{1,2};
        }else if(nums[0] != nums[1]){
            answer = new int[]{1};
        }
//       for(int i =0; i < answer.length ; i++){
//           System.out.println(answer[i]);
//       }
        return answer;
    }
}
