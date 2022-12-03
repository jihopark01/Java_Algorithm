package 문자열내림차순으로배치하기;

import java.util.ArrayList;
import java.util.Collections;

public class Q36 {
    public static void main(String [] args){
        System.out.println(solution("Zbcdefg"));

    }
    public static String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < arr.length; i++){
            list.add((int)arr[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i =0; i < list.size(); i++ ){
            int num = list.get(i);
            char ch =  (char)num;
            answer += ch;
        }
        return answer;
    }
}
