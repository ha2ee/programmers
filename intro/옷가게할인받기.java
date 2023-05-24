package intro;

import java.util.stream.Stream;

public class 옷가게할인받기 {
    public int solution(int price) {
        int answer = Stream.of(price)
            .map(p -> {
                if (p >= 500000) {
                    return (int) (p * 0.8);
                } else if (p >= 300000) {
                    return (int) (p * 0.9);
                } else if (p >= 100000) {
                    return (int) (p * 0.95);
                } else {
                    return p;
                }
            })
            .findFirst()
            .orElse(price);
        return answer;
    }
}
