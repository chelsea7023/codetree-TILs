import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sum = "";
        for(int i = 0; i < n; i++){
            sum += sc.next();
        }
        for(int i = 0; i < sum.length(); i++){
            System.out.print(sum.charAt(i));
            if(i % 5 == 4){
                System.out.println();
            }
        }
    }
}