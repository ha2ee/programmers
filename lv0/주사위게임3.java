package lv0;

public class 주사위게임3 {
    public static void main(String[] args) {
        System.out.println(solution(1, 1, 2 ,2));
    }

    public static int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        int score = 0;
        
        // case 1
        if (a == b && b == c && c == d) {
            score = 1111 * a;
        }
        // Case 2: 3 + 1
        else if (a == b && b == c) {
            score = (int) Math.pow(10 * a + d, 2);
        } else if (a == b && b == d) {
            score = (int) Math.pow(10 * a + c, 2);
        } else if (a == c && c == d) {
            score = (int) Math.pow(10 * a + b, 2);
        } else if (b == c && c == d) {
            score = (int) Math.pow(10 * b + a, 2);
        }
        // Case 3: 2 + 2
        else if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
            int[] counts = new int[7];
            for (int i = 0; i < dice.length; i++) {
                counts[dice[i]]++;
            }
            int pair1 = 0, pair2 = 0;
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 2) {
                    if (pair1 == 0) {
                        pair1 = i;
                    } else {
                        pair2 = i;
                        break;
                    }
                }
            }
            score = (pair1 + pair2) * Math.abs(pair1 - pair2);
        }
        // Case 4: 2 + (1+1)
        else if (a == b && c != d) {
            score = c * d;
        } else if (a == c && b != d) {
            score = b * d;
        } else if (a == d && b != c) {
            score = b * c;
        } else if (b == c && a != d) {
            score = a * d;
        } else if (b == d && a != c) {
            score = a * c;
        } else if (c == d && a != b) {
            score = a * b;
        }
        // Case 5: 1 1 1 1 
        else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < dice.length; i++) {
                if (dice[i] < min) {
                    min = dice[i];
                }
            }
            score = min;
        }
        
        return score;
        }

}
