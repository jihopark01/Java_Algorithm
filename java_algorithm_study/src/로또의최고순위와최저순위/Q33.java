package 로또의최고순위와최저순위;

public class Q33 {
    public static void main(String [] args){
        System.out.println(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19} ));

    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero_num = 0;
        int num = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    num += 1;
                }
            }
        }
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero_num += 1;
            }
        }
        answer = new int[2];
        answer[0] = cal(num + zero_num);
        answer[1] = cal(num);
        return answer;
    }

        public  static int cal(int num){
            int result = 0;
            switch(num){
                case 6 : result = 1; break;
                case 5 : result = 2; break;
                case 4 : result = 3; break;
                case 3 : result = 4; break;
                case 2 : result = 5; break;
                default : result = 6; break;
            }
            return result;
        }

    }

