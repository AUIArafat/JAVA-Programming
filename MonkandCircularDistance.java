import java.util.Scanner;


public class MonkandCircularDistance {
	public static void main(String []args){
		int N,q,r;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int A[][] = new int[N][2];
		for(int i=0;i<N;i++){
			for(int j=0;j<2;j++){
				A[i][j] = in.nextInt();
			}
		}
		q = in.nextInt();
		while(q!= 0){
			int count = 0;
			r = in.nextInt();
			for(int i=0;i<N;i++){
					if(A[i][2]<r)
						++count;
			}
			System.out.println(count);
			--q;
		}
	}
}
