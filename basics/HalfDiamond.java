import java.util.Scanner;
public class HalfDiamond {
  public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();

      int i = 1;
      System.out.println("*");
      while(i<=n){
        int j = 1;
        System.out.print("*");
        while(j<=i){
          System.out.print(j);
          j++;
        }
        int m = i-1;
        while(m >= 1){
          System.out.print(m);
          m--;
        }
        System.out.print("*");
        System.out.println();
        i++;
      }

      int q = n-1;
      while(q>=1){
        System.out.print("*");
        int w = 1;
        while(w<=q){
          System.out.print(w);
          w++;
        }
        int e = w-2;
        while(e >= 1){
          System.out.print(e);
          e--;
        }
        System.out.print("*");
        System.out.println();
        q--;
      }
      System.out.print("*");

      s.close();
  }
}
