import java.util.Scanner;

public class RoyandProfilePicture {
	public static void main(String []args){
		int L,N,W,H;
		Scanner in = new Scanner(System.in);
		L = in.nextInt();
		N = in.nextInt();
		while(N!=0){
			W = in.nextInt();
			H = in.nextInt();
			if(W<L || H<L)
				System.out.println("UPLOAD ANOTHER");
			else if(W==H)
				System.out.println("ACCEPTED");
			else 
				System.out.println("CROP IT");
			--N;
		}
		
	}
}
