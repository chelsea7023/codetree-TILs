import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while(true){
            int a = sc.nextInt();
            if(a<=29){
                sum+=a;
                cnt++;
            }else{
                break;
            }
        }if(cnt>0){
        double avg = (double)sum/cnt;
        System.out.printf("%.2f",avg);
        }
        
    }
}