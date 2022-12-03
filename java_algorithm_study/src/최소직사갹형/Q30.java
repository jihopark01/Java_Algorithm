package 최소직사갹형;

public class Q30 {

    public static void main(String [] args){
        System.out.println(solution(new int [][]{{60,50},{30,70}, {60,30},{80,40}}));

    }
    public static int solution(int[][] sizes) {
        int answer =0;
       for(int i =0; i < sizes.length ; i++){
           if(sizes[i][0] < sizes[i][1]){
               int a = sizes[i][1];
               int b = sizes[i][0];
               sizes[i][0] = a;
               sizes[i][1] = b;
           }
           int max_max = sizes[0][0];
           int min_max = sizes[0][1];

       for(int j =0; j < sizes.length ; j++)    {
           if(sizes[j][0] > max_max){
               max_max = sizes[j][0];
           }
       }
           for(int k =0; k < sizes.length ; k++)    {
               if(sizes[k][1] > min_max){
                   min_max = sizes[k][1];
               }
           }
           answer = max_max * min_max;

       }
       return answer;
    }

}
