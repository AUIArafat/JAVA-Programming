import java.util.Scanner;

public class MagicNumbers {
	public static void main(String []args){
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		while(n>1){
			if(n%1000==144){
				n/=1000;
			}
			else if(n%100 == 14){
				n/=100;
			}
			else if(n%10 == 1){
				n/=10;
			}
			else{
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
