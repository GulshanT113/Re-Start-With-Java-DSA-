import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);// this is global scanner this can be use globally.
    
    public static void display(int[] arr){
      for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
    
    public static void inputArray(int[] arr){
      // Scanner scn = new Scanner(System.in);
      for(int i = 0; i < arr.length; i++) arr[i] = scn.nextInt();
    }
    
    public static void rotateArray(int[] arr, int x){
      int n = arr.length;
      x %= n;
      int[] newArr = new int[n];
      
      if(x > 0){
        int i = x-1;
        int j = n-1;
        int k = 0;
        while(k < x){
          newArr[i] = arr[j];
          j--;
          i--;
          k++;
        }
        k = 0;
        i = x;
        j = 0;
        while(k < n-x){
          newArr[i] = arr[j];
          j++;
          i++;
          k++;
        }
        
      } 
      else {
        int i = n+x;
        int j = 0;
        
        while(i < n){
          newArr[i] = arr[j];
          i++;
          j++;
        }
        
        int k = n + x;
        int l = 0;
        while(l < k){
          newArr[l] = arr[j];
          l++;
          j++;
        }
      }
      display(newArr);
    }
    
    public static void main(String[] args) {
      // Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      
      inputArray(arr);
      
      int k = scn.nextInt();
      
      rotateArray(arr, k);
    }
}