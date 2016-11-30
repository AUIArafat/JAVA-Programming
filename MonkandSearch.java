import java.util.Scanner;


public class MonkandSearch {
	public static void main(String []args){
		int T, count;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		String S;
		while(T!=0){
		count = 0;
		S = in.next();
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)=='A' || S.charAt(i)=='E' || S.charAt(i)=='I' || S.charAt(i)=='O' || S.charAt(i)=='U' || 
			   S.charAt(i)=='a' || S.charAt(i)=='e' || S.charAt(i)=='i' || S.charAt(i)=='o' || S.charAt(i)=='u'){
				++count;
			}
		}
		System.out.println(count);
		--T;
	}
}
}
