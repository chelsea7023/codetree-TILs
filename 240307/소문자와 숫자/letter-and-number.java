import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String small = str.toLowerCase();
        for(int i = 0; i < small.length(); i++){
            if(small.charAt(i) >= 48 && small.charAt(i) <= 57){
                System.out.print(small.charAt(i));
            }else if(small.charAt(i) >= 97 && small.charAt(i) <= 122){
                System.out.print(small.charAt(i));
            }
        }
    }
}