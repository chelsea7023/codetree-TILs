import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0;
        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                cnt = i;
                break;
            }
        }
        int[] num = new int[10];
        for(int i = 0; i < cnt; i++){
            num[arr[i]/10]++;
        }
        for(int i = 1; i < 10; i++){
            System.out.println(i + " - " + num[i]);
        }
    }
}