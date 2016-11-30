import java.util.Scanner;


public class SparseArrays {
	public static void main(String []args){
		int N, Q, count;
		String query;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		String arr[] = new String[1000];
		for(int i=0;i<N;i++){
			arr[i] = in.next();
		}
		Q = in.nextInt();
		for(int i=0;i<Q;i++){
			count = 0;
			query = in.next();
			for(int j=0;j<N;j++){
				if(arr[j].equals(query)){
					++count;
				}
			}
			System.out.println(count);
		}
	}
}
