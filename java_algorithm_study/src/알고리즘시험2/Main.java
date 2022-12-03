package 알고리즘시험2;

public class Main {
    public void solution(int star) {
        for(int i = 0 ; i < star ; i++) {
            int front_space = star - (i + 1);
            int star_num = i * 2 + 1;

            for(int j = 0 ; j < front_space ; j++) System.out.print(" ");
            for(int k = 0 ; k < star_num ; k++) System.out.print("*");
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Main method = new Main();
        int star = 3;
        method.solution(star);
    }
}
