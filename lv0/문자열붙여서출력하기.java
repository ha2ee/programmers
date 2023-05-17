package lv0;

import java.util.Scanner;

public class 문자열붙여서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(1 <= a.length() && a.length() <= 10 && 1 <= b.length() && b.length() <= 10)
        System.out.println(a.concat(b));
        sc.close();
    }
}
