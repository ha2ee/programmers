package intro;

public class 직사각형넓이구하기 {
    public static void main(String[] args) {
        int[][] dots = {{1,1},{2,1},{2,2},{1,2}};
        System.out.println(solution(dots));
    }
    public static int solution(int[][] dots) {
        int answer = 0;
        int x = dots[0][0]-dots[1][0];
        int y = dots[3][0]-dots[2][0];
        answer = x*y;
        return answer;
    }
}
