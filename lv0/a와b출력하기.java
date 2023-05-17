package lv0;
import java.util.Scanner;

public class a와b출력하기 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(-100000 <= a && a <= 100000 && -100000 <= b && b <= 100000){
        System.out.println("a = " +a);
        System.out.println("b = " +b);    
        } else {
            sc.close();
            throw new Exception("a,b 값 둘다 -100,000 이상, 100,000 이하여야합니다.");
        }
        sc.close();
    }
}
