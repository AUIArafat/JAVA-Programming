import java.util.Scanner;

public class StringTask {
	public static void main(String []args){
		String S;
		Scanner in = new Scanner(System.in);
		S = in.next();
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)=='A' || S.charAt(i)=='a' ||
			   S.charAt(i)=='E' || S.charAt(i)=='e' ||
			   S.charAt(i)=='I' || S.charAt(i)=='i' ||
			   S.charAt(i)=='O' || S.charAt(i)=='o' ||
			   S.charAt(i)=='U' || S.charAt(i)=='u' ||
			   S.charAt(i)=='Y' || S.charAt(i)=='y' ){
				continue;
			}
			else if(S.charAt(i)>='A' && S.charAt(i)<='Z'){
					System.out.print(".");
				System.out.print(S.toLowerCase().charAt(i));
			}
			else{
					System.out.print(".");
				System.out.print(S.charAt(i));
			}
		}
	}
}
