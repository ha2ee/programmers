package lv1;

public class 문자리스트를문자열로변환하기 {


    public static void main(String[] args) {
        System.out.println();  

    }

    public static String solution(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for(String s : arr){
            sb.append(s);
        }
        return sb.toString();
        }
    }
