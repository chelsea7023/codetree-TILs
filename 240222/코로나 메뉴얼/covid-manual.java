//Y >=37 A
//nY >=37 B
// Y <37 C
// nY <37 D
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for(int i = 0; i < 3; i++){
            if(sc.next().charAt(0) == 'Y'){
                if(sc.nextInt() >= 37){
                    cnt++;
                }else{
                    continue;
                }
            }else{
                int a = sc.nextInt();
                continue;
            }
        }
        if(cnt >= 2){
            System.out.println("E");
        }else{
            System.out.println("N");
        }
    }
}