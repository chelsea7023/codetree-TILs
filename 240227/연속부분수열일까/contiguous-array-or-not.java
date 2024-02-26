import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] N = new int[n1];
        int[] M = new int[n2];

        for(int i = 0; i < n1; i++){
            N[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++){
            M[i] = sc.nextInt();
        }

        boolean success = true;

        for(int i = 0; i < n1; i++){
            if(N[i] == M[0]){
                for(int j = 0; j < n2; j++){
                    if(N[i + j] != M[j]){
                        success = false;
                        break;
                    }
                }
                if (success) {
                    break; // Break the outer loop if success is true
                }
            }
        }
        
        if(success){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}