import java.util.Scanner;


public class TheBeatles {
	public static void main(String []args){
		int N, a;
		int count;
		int c = 0;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		while(N!=0){
			count = 1;
			a = in.nextInt();
			if(a%30==0){
				System.out.println(count);
			++c;
			}
			++count;
			--N;
		}
		if(c==0)
			System.out.println("-1");
	}
}
