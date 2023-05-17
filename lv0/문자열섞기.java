package lv0;

public class 문자열섞기 {


    public static void main(String[] args) {
        System.out.println(solution("123","456"));  

    }

    public static String solution(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        String answer = "";
        for(int i = 0; i<arr1.length; i++) {
           String temp = arr1[i] +arr2[i];
           answer += temp;
        }
        return answer;
    }
}
