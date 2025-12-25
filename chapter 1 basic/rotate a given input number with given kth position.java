import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      int count = 0;
      int temp = n;
      while(temp > 0){
        temp /= 10;
        count++;
      }
      
      k %= count;
      if(k < 0){
        k += count;
      }
      
      int div = 1;
      int mul = 1;
      
      for(int i = 1; i <= count; i++){
        if(i <= k) div *= 10;
        else mul *= 10;
      }
      
      int quiescent = n / div;
      int remender = n % div;
      int rotate = remender * mul + quiescent;
      System.out.println(rotate);
  }
}