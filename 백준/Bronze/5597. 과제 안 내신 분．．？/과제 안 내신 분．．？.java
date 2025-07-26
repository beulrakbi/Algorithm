import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      boolean[] all = new boolean[31];
      for (int i =0; i<28; i++){
         int num = sc.nextInt();
         all[num] = true;
      }

      for(int i =1; i<=30; i++){
         if(!all[i]){
            System.out.println(i);
         }
      }

   }
}

