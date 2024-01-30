import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a;
        boolean satisfied = true;
        for(int i = 0; i < 5; i++){
            a = sc.nextInt();
            if(a%3 != 0){
                satisfied = false;
            }
            
        }if(satisfied == false){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}