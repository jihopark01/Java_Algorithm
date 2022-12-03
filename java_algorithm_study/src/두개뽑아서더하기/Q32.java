package 두개뽑아서더하기;
import java.util.ArrayList;
import java.util.Arrays;
public class Q32 {
    public static void main(String [] args){
        System.out.println();

    }
    public  static int[] solution(int[] numbers) {
        ArrayList <Integer> arr1 = new ArrayList<Integer>();
        ArrayList <Integer> arr2 = new ArrayList<Integer>();
        for(int i =0 ; i < numbers.length; i++){
            for(int j = i+1 ; j < numbers.length; j++){
                arr1.add(numbers[i] + numbers[j]);
            }
        }
        for(int k =0; k< arr1.size(); k++){
            if(!arr2.contains(arr1.get(k))){
                arr2.add(arr1.get(k));
            }
        }
        int[] answer = new int[arr2.size()];
        for(int i =0; i< arr2.size(); i++){
            answer[i] = arr2.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
