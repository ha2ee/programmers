package intro;

public class 외계행성의나이 {

    public static void main(String[] args) {
        System.out.println(solution(23));
    }

    public static String solution(int age) {
        String answer = "";
        String[] ages = String.valueOf(age).split("");
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(;;){
            if(idx == ages.length){
                break;
            } else if(ages[idx].equals("0")){
                sb.append("a");
            } else if(ages[idx].equals("1")){
                sb.append("b");
            } else if(ages[idx].equals("2")){
                sb.append("c");
            } else if(ages[idx].equals("3")){
                sb.append("d");
            } else if(ages[idx].equals("4")){
                sb.append("e");
            } else if(ages[idx].equals("5")){
                sb.append("f");
            } else if(ages[idx].equals("6")){
                sb.append("g");
            } else if(ages[idx].equals("7")){
                sb.append("h");
            } else if(ages[idx].equals("8")){
                sb.append("i");
            } else if(ages[idx].equals("9")){
                sb.append("j");
            }
            System.out.println(ages[idx]);
            idx++;
        }
        answer = sb.toString();
        return answer;
    }
}
