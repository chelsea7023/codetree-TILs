public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5, b = 6, c = 7;
        int temp1, temp2;

        temp2 = c;
        temp1 = b;
        b = a;
        c = temp1;
        a = temp2;       
        System.out.println(a+"\n"+b+"\n"+c);
    }
}