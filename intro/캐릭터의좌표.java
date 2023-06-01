package intro;

public class 캐릭터의좌표 {
    public static void main(String[] args) {
        String[] keyinput = {"right", "right", "right", "right", "right", "left"};
        int[] board = {9, 5};
        int[] result = solution(keyinput, board);
        for(int i : result){
            System.out.println(i);
        }
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String key : keyinput){
            if(key.equals("left")){
                answer[0]-= 1;
            } else if(key.equals("right")){
                answer[0]+= 1;
            } else if(key.equals("down")){
                answer[1] -= 1;
            } else if(key.equals("up")){
                answer[1] += 1;
            }
            if(Math.abs(answer[0])>Math.abs(board[0]/2)){
                if(answer[0]<0){
                    answer[0] = -board[0]/2;    
                } else {
                    answer[0] = board[0]/2;
                }
                
            }
            if(Math.abs(answer[1])>Math.abs(board[1]/2)){
                if(answer[1]<0){
                    answer[1] = -board[1]/2;    
                } else {
                    answer[1] = board[1]/2;
                }
            }
        }
        return answer;
    }
}
