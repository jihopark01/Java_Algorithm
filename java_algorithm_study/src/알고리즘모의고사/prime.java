package 알고리즘모의고사;

import java.util.ArrayList;

import java.util.Collections;

public class prime {
    public static String solution(String s) {
        String answer = "";
        String []  result = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int k =0 ; k < result.length ; k++){
            if(is_prime(Integer.parseInt(result[k])) == 2){
                arr.add(Integer.parseInt(result[k]));
            }else{
                arr1.add(Integer.parseInt(result[k]));
            }
        }
        Collections.sort(arr, Collections.reverseOrder());
        Collections.sort(arr1);

        answer = "" + arr1.get(0)+ " "+arr.get(0);



        return answer;
    }
    public static int is_prime(int a){
        int num =0;
        for(int i =1 ; i <= a ; i++){
            if(a % i ==0){
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {

        String s =  "97 75 88 99 95 92 73";
        System.out.println(solution(s));
    }
}
