import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      int n1 = scn.nextInt();
      int[] arr1 = new int[n1];
      for(int i = 0; i < n1; i++) arr1[i] = scn.nextInt();
      
      int n2 = scn.nextInt();
      int[] arr2 = new int[n2];
      for(int i = 0; i < n2; i++) arr2[i] = scn.nextInt();
      
      int[] diff = new int[n2];
      
      int carry = 0;
      int i = n1-1;
      int j = n2-1;
      int k = n2-1;
      
      while(k >= 0){
        int d = 0;
        int arr1Val = i >= 0 ? arr1[i] : 0;
        
        if(arr2[j] + carry >= arr1Val){
          d = (arr2[j] + carry) - arr1Val;
          carry = 0;
        } else {
          d = (arr2[j] + carry + 10) - arr1Val;
          carry = -1;
        }
        
        diff[k] = d;
        
        k--;
        j--;
        i--;
      }
      int idx = 0;
      
      while(idx < n2){
        if(diff[idx] == 0) idx++;
        else break;
      }
      
      while(idx < diff.length){
        System.out.print(diff[idx] + " ");
        idx++;
      }
      
    }
}