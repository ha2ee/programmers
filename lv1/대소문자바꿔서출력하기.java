package lv1;
import java.util.Scanner;

public class 대소문자바꿔서출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        for(int i = 0; i < a.length(); i++) {
            if('A' <= a.charAt(i) && a.charAt(i) <= 'Z') {
                output += (char)(a.charAt(i) + 32);
            } else {
                output += (char)(a.charAt(i)-32);
            }
        }
        System.out.println(output);
        sc.close();
    }
    
}
