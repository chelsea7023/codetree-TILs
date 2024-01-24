import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        //n나누기 4는 윤년 외에는 평년
        //100으로 나누어떨어지지만 400으로는 안나누어 떨어지는 해는 평년
        for(int i =1; i<=n;i++){
            if(i%4==0){
                cnt ++;
            }
            if(i%100==0&&i%400!=0){
                cnt--;
            }
    }System.out.println(cnt);
    }
}