package intro;

public class 문자열정렬하기1 {
    public static void main(String[] args) {
        solution("dd123");
    }

    public static int[] solution(String my_string) {
        int[] answer = my_string.replaceAll("[a-z]","").chars().sorted().map(i-> Character.getNumericValue(i)).toArray();
        return answer;
    }
}
