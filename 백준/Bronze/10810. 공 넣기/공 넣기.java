import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] arr = new int[n+1];
      for(int ii = 0; ii<m; ii++){
         int i = sc.nextInt(); //시작
         int j = sc.nextInt(); //끝
         int k = sc.nextInt(); //공 번호

         for (int jj=i; jj<=j; jj++){
            arr[jj]=k;
         }
      }
      for (int a = 1; a<=n; a++){
         System.out.print(arr[a] + " ");
      }
   }
}

