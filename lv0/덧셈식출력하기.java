package lv0;

import java.util.Scanner;

public class 덧셈식출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(1 <= a && a <= 100 && 1 <= b && b <= 100){
        System.out.println(a + " + " + b +" = " + (a + b));
        }
        sc.close();
    }
    
}
