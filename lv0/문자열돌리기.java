package lv0;

import java.util.Scanner;

public class 문자열돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.length() > 10 && a.length() < 1) {
            System.exit(0);
        }
        for(char c : a.toCharArray()) {
            System.out.println(c);
        }
    }
}
