package lv0;

import java.util.Scanner;

public class 홀짝구분하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(1 > n && n > 1000) {
            System.exit(0);
        }
        System.out.println(n%2 == 0 ? n+" is even" : n+" is odd");
    }
}
