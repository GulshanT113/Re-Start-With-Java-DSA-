import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);// this is global scanner this can be use globally.
    
    public static void solution(ArrayList<Integer> al){
      for(int i = al.size()-1; i >= 0; i--){
        int val = al.get(i);
        if(isPrime(val) == true) al.remove(i);
      }
    }
    
    public static Boolean isPrime(int val){
      for(int i = 2; i*i <= val; i++){
        if(val % i == 0) return false;
      }
      return true;
    }
    
    public static void main(String[] args) {
      int n = scn.nextInt();
      ArrayList<Integer> al = new ArrayList<>();
      for(int i = 0; i < n; i++) al.add(scn.nextInt());
      solution(al);
      System.out.println(al);
    }
}