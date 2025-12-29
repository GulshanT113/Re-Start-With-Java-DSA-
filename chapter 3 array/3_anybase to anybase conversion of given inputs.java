import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();  // input value
      int b1 = scn.nextInt(); // input base
      int b2 = scn.nextInt(); // convert base, binary, octal, decimal
      int result = anybaseToAnybase(n, b1, b2);
      System.out.println(result);
    }
    
    public static int anybaseToAnybase(int n, int b1, int b2){
      int dec = anybaseToDesimal(n, b1);
      int decToAny = desimalTOAnybase(dec, b2);
      return decToAny;
    }
    
    public static int desimalTOAnybase(int n, int b){
      int pwr = 1;
      int rv = 0;
      while(n > 0){
        int rem = n%b;
        n /= b;
        rv += rem * pwr;
        pwr *= 10;
      }
      return rv;
    }
    
    public static int anybaseToDesimal(int n, int b){
      int pwr = 1;
      int rv = 0;
      while(n > 0){
        int rem = n%10;
        n /= 10;
        rv += rem * pwr;
        pwr *= b;
      }
      return rv;
    }
}