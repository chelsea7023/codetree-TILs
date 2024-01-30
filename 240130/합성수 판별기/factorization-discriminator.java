import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean satisfied = false;
        if(n%2==0||n%3==0){
            satisfied = true;
        }
        if(satisfied == false){
            System.out.println('N');
        }else{
            System.out.println('C');
        }
        
    }
}