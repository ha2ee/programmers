package intro;

public class 주사위의개수 {
    public static void main(String[] args) {
        int[] box = {10,8,6};
        int n = 3;
        System.out.println(solution(box, n));
    }

    public static int solution(int[] box, int n) {
        int answer = 0;
        int a = box[0]/n;
        int b = box[1]/n;
        int c = box[2]/n;
        answer = a*b*c;
        return answer;
    }
}
