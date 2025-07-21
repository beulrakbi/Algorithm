import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) { // 입력이 더 있을 때까지 반복
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }

        sc.close();
    }
}