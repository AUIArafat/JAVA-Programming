import java.util.Scanner;


public class MonkandWelcomeProblem {
	public static void main(String []args){
		int N;
		int A[] = new int[100000];
		int B[] = new int[100000];
		int C[] = new int[200000];
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		for(int i=0;i<N;i++){
			A[i] = in.nextInt();
		}
		for (int j = 0; j < N; j++) {
			B[j] = in.nextInt();
		}
			
		for (int i = 0; i < N; i++) {
			C[i] = A[i] + B[i];
			System.out.print(C[i]+" ");
		}
 	}
}
