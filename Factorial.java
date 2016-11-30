import java.util.Scanner;


public class Factorial {
	public static void main(String []args){
		int N;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		for(int i=1;i<=N;i++){
			N = N*i;
		}
		System.out.println(N);
	}
}
