import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);// this is global scanner this can be use globally.
    // if we want to perform the operation during loops use stringbuilder instead of string.
    // because of builder is more faster then string during operations and also we have lots of option during options.
    public static void main(String[] args) {
      // int n = 100000;
      // long start = System.currentTimeMillis();
      StringBuilder sb = new StringBuilder("hello");
      // for(int i = 0; i < n; i++){
      //   sb.append(i);
      // }
      // long end = System.currentTimeMillis();
      // long duration = end - start;
      // System.out.println(duration);
      System.out.println(sb.charAt(0)); //get
      sb.setCharAt(0, 'g');
      System.out.println(sb);  // update
      sb.insert(0, 'g'); // add on the bases of location.
      System.out.println(sb); // 
      sb.deleteCharAt(2); // delete the char.
      System.out.println(sb);
      sb.append('A'); // add on last position.
      System.out.println(sb);
    }
}