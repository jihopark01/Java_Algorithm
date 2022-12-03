package 알고리즘모의고사;

public class Main {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        //새벽 다섯시 넘어간거 바꿔주기
        for(int i =0; i< arr2.length; i++){
            if(arr2[i] > 28){
                arr2[i]  = 21;
            }
        }
        int [] hours = new int[7];
        for(int i =0; i < arr1.length; i++){
            hours[i] = arr2[i] - arr1[i];
        }
        for(int i =0; i < 7; i++){
            answer += hours[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }
}