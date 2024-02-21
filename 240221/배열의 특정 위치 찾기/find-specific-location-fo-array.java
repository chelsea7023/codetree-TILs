import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;
        int sum3 = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 1){
                sum+=arr[i];
            }
            if((i + 1) % 3 == 0){
                sum3 += arr[i];
                cnt++;
            }
        }

        
        System.out.print(sum + " ");
        System.out.printf("%.1f", (double)sum3/cnt);
        
    }
}