import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = n;
        int cnt = 0;
        for(int i = 2; i < 12; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            if(arr[i] > 100){
                cnt = i;
                break;
                
            }
        }
        for(int i = 0; i <= cnt; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}