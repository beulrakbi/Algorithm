import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int totalPrice = sc.nextInt();
      int n = sc.nextInt();
      int mul = 0;
      for(int i = 0; i<n; i++){
         int a = sc.nextInt();
         int b = sc.nextInt();
         mul += a*b;
      }
      if(totalPrice == mul){
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }
   }
}