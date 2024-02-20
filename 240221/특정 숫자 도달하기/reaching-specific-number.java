import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0; 
        int sum2 = 0;
        int cnt = 0;
        int cnt2 = 0;
        for(int i = 0; i < 10; i ++){
            num[i] = sc.nextInt();
           if(num[i] < 250){
                sum += num[i];
                cnt++;
           }else{
                break;
        }
    }System.out.printf(sum + " " + ((double)sum/cnt));
}
}