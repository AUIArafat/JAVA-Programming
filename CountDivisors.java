import java.util.Scanner;

public class CountDivisors {
	public static void main(String []args){
		int l,r,k;
		Scanner in = new Scanner(System.in);
		l = in.nextInt();
		r = in.nextInt();
		k = in.nextInt();
		int count = 0;
		for(int i=l;i<=r;i++){
			if(i%k==0)
				++count;
		}
		System.out.println(count);
	}
}
