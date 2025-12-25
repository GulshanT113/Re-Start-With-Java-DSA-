import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int totalCount = scn.nextInt();
      
      /* this is a brute force approach */
      
      // for(int i = 0; i < totalCount; i++){
      //   int n = scn.nextInt();
      //   int count = 0;
      //   for(int j = 1; j <= n; j++){
      //     if(n % j == 0){
      //       count++;
      //     }
      //   }
      //   if(count == 2){
      //     System.out.println(n + " Nubmer is prime");
      //   } else {
      //     System.out.println(n + " Number is not prime");
      //   }
      // } 
      
      /*optimize solution*/
      
      for(int i = 0; i < totalCount; i++){
        int n = scn.nextInt();
        int count = 0;
        for(int j = 2; j * j <= n; j++){
          if(n % j == 0){
            count++;
          }
        }
        if(count == 0){
          System.out.println(n + " Nubmer is prime");
        } else {
          System.out.println(n + " Number is not prime");
        }
      }
      System.out.println("Work is Done For Prime Or Not For N Numbers of Inputs.");
  }
}