/*import java.util.Scanner;
public class Capital{
public static void toUpperCase(String stringName){
		char []upperCase = new char[1000];
		for(int i=0;i<stringName.length();i++){
			if(stringName.charAt(i) > 96 && stringName.charAt(i)<123 && i==0){
				upperCase[i] = (char)(stringName.charAt(i) - 32);
			}
			else
				upperCase[i] = (char)(stringName.charAt(i));
		}
		for(int i=0;i<stringName.length();i++){
			System.out.print(upperCase[i]);
		}
	}
	public static void main(String []args){
		String s;
		Scanner in = new Scanner(System.in);
		s = in.next();
		toUpperCase(s);
	}
	
}
*/
import java.util.Scanner;
public class Capital{
public static void toUpperCase(String stringName){
		char []upperCase = new char[100];
		for(int i=0;i<stringName.length();i++){
			if(stringName.charAt(i) > 96 && stringName.charAt(i)<123){
				upperCase[i] = (char)(stringName.charAt(i) - 32);
			}
			else
				upperCase[i] = (char)(stringName.charAt(i));
		}
		for(int i=0;i<stringName.length();i++){
			System.out.print(upperCase[i]);
		}
	}
	//ToLowerCase...
public static void toLowerCase(String stringName){
		char []lowerCase = new char[100];
		for(int i=0;i<stringName.length();i++){
			if(stringName.charAt(i)>64 && stringName.charAt(i)<92){
				lowerCase[i] = (char)(stringName.charAt(i)+32);
			}
			else
				lowerCase[i] = (char)(stringName.charAt(i));
		}
		for(int i=0;i<stringName.length();i++){
			System.out.print(lowerCase[i]);
		}
	}
	public static void main(String []args){
		String s;
		int lCount = 0, uCount = 0;
		Scanner in = new Scanner(System.in);
		s = in.next();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) > 96 && s.charAt(i)<123){
				++lCount;
			}
			else
				++uCount;
		}
		if(lCount>=uCount) toLowerCase(s);
		else toUpperCase(s);
			
		
		
	}
	
}