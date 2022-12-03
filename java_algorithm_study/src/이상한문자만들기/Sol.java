package 이상한문자만들기;

import java.util.List;
import java.util.ArrayList;

public class Sol {
    public  void main (String[] args) {
        System.out.println(solution("try hello world"));
    }

    public String solution(String s) {
        List<String> list = new ArrayList<>();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            String a = "";
            for (int j = 0; j < s1[i].length(); j++) {
                if (j % 2 == 1) {
                    a += Character.toUpperCase(s1[i].charAt(j));
                } else {
                    a += s1[i].charAt(j);
                }
            }
            list.add(a);
        }
        String str = "";
        for (String item : list) {
            str += item + " ";
        }
        return str.strip();
    }
}
