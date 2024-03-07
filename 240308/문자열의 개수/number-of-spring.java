import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; true; i++){
            String str = sc.next();
            if(str.equals("0")){
                break;
            }
            cnt++;
            list.add(str);
        }
        System.out.println(cnt);
        for(int i = 0; i < list.size(); i++){
            if(i % 2 == 0){
                System.out.println(list.get(i));
            }
        }
    }
}