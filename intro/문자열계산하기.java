package intro;

public class 문자열계산하기 {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        
        for(int i = 1; i<arr.length; i++){
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i+1]);
            }else if(arr[i].equals("-")){
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        
        return answer;
    }
}
