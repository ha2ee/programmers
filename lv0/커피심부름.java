package lv0;

import java.util.Arrays;

public class 커피심부름 {
    public static void main(String[] args) {
        
    }

    public int solution(String[] order) {
        int answer = 0;
        
        int americanoPrice = 4500;
        int cafeLattePrice = 5000;
        
        answer = Arrays.stream(order)
            .mapToInt(menu -> {
                switch(menu) {
                    case "iceamericano":
                    case "americanoice":
                    case "hotamericano":
                    case "americanohot":
                    case "americano":
                    case "anything":
                        return americanoPrice;
                    case "icecafelatte":
                    case "cafelatteice":
                    case "hotcafelatte":
                    case "cafelattehot":
                    case "cafelatte":
                        return cafeLattePrice;
                    default:
                        return 0;
                }
            })
            .sum();
        
        return answer;
    }
}
