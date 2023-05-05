package programmers;
import java.util.Scanner;

public class 문자열출력하기 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a = sc.next();
            String str = a.replaceAll(" ", "");
            if(1 <= str.length() && str.length() <= 1000000) {
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println("글자는 1자 이상, 1,0000,000자 이하로 적어주세요");
        }
    }
}
