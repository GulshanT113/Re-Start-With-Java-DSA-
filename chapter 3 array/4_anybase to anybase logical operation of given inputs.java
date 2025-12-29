import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int base = scn.nextInt();  // input value
      int n1 = scn.nextInt(); // input base
      int n2 = scn.nextInt(); // convert base, binary, octal, decimal
      // int result1 = anybaseAddition(base, n1, n2);
      // System.out.println(result1);
      // int result2 = anybaseSubtraction(base, n1, n2);
      // System.out.println(result2);
      int result3 = anybaseMultiplication(base, n1, n2);
      System.out.println(result3);
    }
    
    public static int anybaseAddition(int base, int n1, int n2){
      int returnVal = 0;
      int carry = 0;
      int pwr = 1;
      while(n1 > 0 || n2 > 0 || carry > 0){
        int d1 = n1 % 10;
        int d2 = n2 % 10;
        n1 /= 10;
        n2 /= 10;
        int d = d1 + d2 + carry;
        carry = d / base;
        d %= base;
        returnVal += d * pwr;
        pwr *= 10;
      }
      return returnVal;
    }
    
    public static int anybaseSubtraction(int base, int n1, int n2){
      int returnVal = 0;
      int carry = 0;
      int pwr = 1;
      while(n2 > 0){
        int d1 = n1 % 10;
        int d2 = n2 % 10;
        n1 /= 10;
        n2 /= 10;
        int d = 0;
        d2 += carry;
        if(d2 >= d1){
          carry = 0;
          d = d2 - d1;
        } else {
          carry = -1;
          d = d2 + base - d1;
        }
        returnVal += d * pwr;
        pwr *= 10;
      }
      return returnVal;
    }
    
    public static int getProductWithSingleDigit(int base, int n1, int d2){
      int returnVal = 0;
      int carry = 0;
      int pwr = 1;
      while(n1 > 0 || carry > 0){
        int d1 = n1 % 10;
        n1 /= 10;
        int d = d1 * d2 + carry;
        carry = d / base;
        d %= base;
        returnVal += d * pwr;
        pwr *= 10;
      }
      return returnVal;
    }
    
    public static int anybaseMultiplication(int base, int n1, int n2){
      int returnVal = 0;
      int pwr = 1;
      while(n2 > 0){
        int d2 = n2 % 10;
        n2 /= 10;
        int sprd = getProductWithSingleDigit(base, n1, d2);
        returnVal = anybaseAddition(base, returnVal, sprd * pwr);
        pwr *= 10;
      }
      return returnVal;
    }
    
}