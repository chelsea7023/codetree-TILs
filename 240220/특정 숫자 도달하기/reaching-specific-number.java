import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for(int i = 0; i < 10; i ++){
            num[i] = sc.nextInt();
        }
        int sum = 0;
        int cnt = 0; 
        for(int i = 0; i < 10; i++){
            if(num[i] >= 260){
                for(int j = 0; j < i; j++){
                    sum += num[j];
                    cnt++;
                }System.out.print(sum + " ");

                System.out.printf("%.1f", ((double)sum/cnt));
                break;
            }
        }
    }
}