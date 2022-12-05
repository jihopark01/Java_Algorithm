package 알고리즘코딩테스트JAVA.자료구조.배열과리스트;

import java.util.Scanner;

public class 숫자의합구하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum =0;
        for(int i =0 ; i < cNum.length; i ++){
            sNum += cNum[i]- '0';
        }
        System.out.println(sum);
    }
}
