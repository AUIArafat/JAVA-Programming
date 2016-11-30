import java.util.Scanner;


public class LifetheUniverseandEverything {
	public static void main(String []args){
		int N;
		Scanner in = new Scanner(System.in);
		while(true){
			N = in.nextInt();
			if(N==42)
				break;
			System.out.println(N);
		}
	}
}
