import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[9];
      int count=0;
      for (int i = 0; i<arr.length; i++){
         arr[i]=sc.nextInt();
      }
      int max = arr[0];
      for(int i =1; i<arr.length; i++){
         if(max<arr[i]){
            max=arr[i];
            count=i;
         }
      }
      System.out.println(max +" "+ (count+1) );
   }
}
