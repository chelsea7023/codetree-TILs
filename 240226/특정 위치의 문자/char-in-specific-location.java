import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};
        for(int i = 0; i < 6; i ++){
            if(arr[i] == a){
                System.out.print(i);
                break;
            }else{
                System.out.print(0);
            }
        }
        
    }
}