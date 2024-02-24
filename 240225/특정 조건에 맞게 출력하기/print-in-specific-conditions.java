import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        int cnt = 0;
        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                cnt = i;
                break;
            }
            
        }
        for(int j = 0; j < cnt; j++){
            if(arr[j] % 2 == 1){
                arr[j] += 3;
                System.out.print(arr[j] + " ");
            }else{
                arr[j] /= 2;
                System.out.print(arr[j] + " ");
            }
        }
    }
}