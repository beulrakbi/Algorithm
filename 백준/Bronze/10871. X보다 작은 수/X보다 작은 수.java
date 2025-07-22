import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int X = sc.nextInt();
      int[] a = new int[N];
      ArrayList<Integer> count = new ArrayList<>();
      for(int i = 0; i<N; i++){
         a[i]=sc.nextInt();
         if(a[i]<X){
            count.add(a[i]);
         }
      }
      for(int i = 0; i<count.size(); i++){
         System.out.print(count.get(i) + " ");
      }

   }
}