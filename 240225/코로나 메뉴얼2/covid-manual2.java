import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int cnt = 0; 
        for(int i = 0; i < 3; i++){
            char a = sc.next().charAt(0);
            int num = sc.nextInt();
            if(a == 'Y' && num >= 37){
                cnt++;
                arr[1]++;
            }else if(a == 'N' && num >=37){
                arr[2]++;
            }else if(a == 'Y' && num < 37){
                arr[3]++;
            }else{
                arr[4]++;
            }
        }for(int i = 1; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
        if(cnt >= 2){
            System.out.print("E");
        }
        
    }
}