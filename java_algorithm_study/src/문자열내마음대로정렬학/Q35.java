package 문자열내마음대로정렬학;
import java.util.ArrayList ;
import java.util.Arrays;
import java.util.Collections;

public class Q35 {
    public static void main(String [] args){
        System.out.println();

    }
    public static String[] solution(String[] strings, int n){
        String [] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i =0; i < strings.length; i++ ){
            arr.add(""+strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(arr);
        answer = new String [arr.size()];
        for(int i =0; i < arr.size(); i++){
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
 return answer;
    }
}
