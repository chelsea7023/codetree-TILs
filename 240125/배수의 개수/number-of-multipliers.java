import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i<10;i++){
            a = sc.nextInt();
            if(a%3==0){
                cnt1++;
            }else if(a%5==0){
                cnt2++;
            }
            if(a%3==0&&a%5==0){
                cnt2++;
            }
        }System.out.print(cnt1+" ");
            System.out.print(cnt2);
    }
}