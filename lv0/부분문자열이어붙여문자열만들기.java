package lv0;

public class 부분문자열이어붙여문자열만들기 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts ={{0,4},{1,2},{3,5},{7,7}};
        System.out.println(solution(my_strings, parts));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < parts.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];

                String temp = my_strings[i].substring(s, e+1);
                answer += temp;
            }

            return answer;
        }
    }
