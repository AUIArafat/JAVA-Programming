import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class numberSort implements Comparable<numberSort>{
	
	String S;
	double N;
	public numberSort(String s, Double n) {
		S = s;
		N = n;
	}
	public String getS() {
		return S;
	}
	public void setS(String s) {
		S = s; 
	}
	public double getN() {
		return N;
	}
	public void setN(double n) {
		this.N = n;
	}
	
	public static Comparator<numberSort> FruitNameComparator= new Comparator<numberSort>() {

	public int compare(numberSort num1, numberSort num2) {
	
	Double Number1 = num1.getN();
	Double Number2 = num2.getN();
	
	//ascending order
	return Number1.compareTo(Number2);
	
	}
};
	
	public static void main(String []args){
		int T;
		int N;
		Double C;
		String S = null;
		numberSort[] nSort  =new numberSort[1000009];
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		while(T!=0){
			N = in.nextInt();
			for(int i=0;i<N;i++){
				S = in.next();
				C = Double.parseDouble(S);
				System.out.println(S + " ");
				nSort[i] = new numberSort(S,C);
			}
			Arrays.sort(nSort, numberSort.FruitNameComparator);
			try {
				int i=0;
				while(i<nSort.length){
					System.out.println(nSort[i].getS() + " ");
					++i;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			--T;
		}
	}
	@Override
	public int compareTo(numberSort o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
