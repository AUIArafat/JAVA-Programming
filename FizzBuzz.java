import java.util.Scanner;


public class FizzBuzz {
	public static void main(String []args){
		int T;
		int N;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		while(T!=0){
			N = in.nextInt();
			for(int i=1;i<=N;i++){
				if(N%3==0)
					System.out.println("Fizz");
				else if(N%5 == 0)
					System.out.println("Buzz");
				else if(N%3==0 && N%5 == 0)
					System.out.println("FizzBuzz");
				else
					System.out.println(i);
			}
		}
	}
}
