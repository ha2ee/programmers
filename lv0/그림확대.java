package lv0;

public class 그림확대 {
    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;
        solution(picture, k);
    }

    public static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        
        for(int i = 0; i<picture.length*k; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<picture[0].length()*k; j++){
                char ch = picture[i/k].charAt(j/k);
                sb.append(ch);
                }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
