package 같은숫자는싫어;
import java.util.ArrayList;
public class Q31 {

    public static void main(String [] args){
        System.out.println(solution(new int[] {4,4,4,3,3}));

    }
    public static int[] solution(int []arr) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(arr[0]);
        for (int i=0; i< arr.length -1; i++){

            if(arr[i+1] != arr[i]){
                arr1.add(arr[i+1]);
            }
        }
        int [] answer = new int[arr1.size()];
        for(int k =0; k< arr1.size(); k++){
            answer[k] = arr1.get(k);
        }
//      for(int  k=0; k < answer.length; k++){
//          System.out.println(answer[k]);
//      }
       return answer;
    }
}
