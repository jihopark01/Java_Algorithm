package 제일작은수제거하기;

import java.util.Arrays;

public class Q26 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{4, 3, 2, 1}));

    }

    public static int[] solution(int[] arr) {
        int[] nonArr = {-1};
        int min = arr[0];
        if (arr.length == 1) {
            return nonArr;
        } else {

            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            int idx= 0;
            int [] answer = new int[arr.length -1];
            for(int i =0; i< arr.length ; i++){
                if(arr[i] != min){
                    answer[idx] = arr[i];
                    idx++;
                }
            }
            return answer;
        }

    }
}
