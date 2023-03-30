import java.util.Scanner;

public class diamondpattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =1;
		int n1 = (n+1)/2;
		int n2 = n1-1;
		while(i<=n1){
				int j = 1;
				while(j<=n1-i){
				 System.out.print(" ");
				j++;
	 }
					int k = 1;
					while(k<=(2*i)-1){
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		} 		

	 int a = n2;
	 while(a >= 1){
		 int b = 1;
		 while(b<=n2-a+1){
				 System.out.print(" ");
				 b++;
		 }			
		 int c = 1;
		 while(c<=(2*a)-1){
		 System.out.print("*");
		 c++;
	 }
	 System.out.println();
	 a--;
	 }
	s.close();	
	}

}
