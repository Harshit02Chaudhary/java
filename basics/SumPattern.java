import java.util.Scanner;
public class SumPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        int sum = 1;
        while(i<=n){
            int j = 1;
            int t = 1;
            while(j<=i){
                if(t<i){
                    System.out.print(t + "+");
                    t++;
                    j++;
                }
                else{
                    System.out.print(t + "=" + sum);
                    j++;
                }
                
            }
            System.out.println();
            i++;
            sum += i;
        }
    s.close();
    }
}
