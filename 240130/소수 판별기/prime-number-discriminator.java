import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean satisfied = true;
        if(n%2 == 0 || n%3 == 0 || n%5 == 0 || n%7 == 0){
            satisfied = false;
        }
        if(satisfied == false){
            System.out.println('P');
        }else{
            System.out.println('C');
        }
    }
}