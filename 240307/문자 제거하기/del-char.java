import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = str.length();
        for(int i = 0; i < num - 1; i++){
            int a = sc.nextInt();
            if(a >= str.length()){
                str = str.substring(0, str.length() - 1);
            }else{
                str = str.substring(0, a) + str.substring(a + 1, str.length());
            }
            System.out.println(str);
        }
    }
}