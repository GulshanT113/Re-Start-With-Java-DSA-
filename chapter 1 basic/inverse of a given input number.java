import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int inverse = 0;
      int originalPosition = 1;
      while(n != 0){
        int originalDigit = n % 10;
        int invertedDigit = originalPosition;
        int invertedPosition = originalDigit;
        inverse = inverse + invertedDigit * (int)Math.pow(10, invertedPosition-1);
        n /= 10;
        originalPosition++;
      }
      System.out.println(inverse);
  }
}