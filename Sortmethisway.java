import java.util.Scanner;
public class Sortmethisway {
	public static void main(String []args){
		int N;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++){
			A[i] = in.nextInt();
		}
		int i, j, first, temp;  
	     for ( i = A.length - 1; i > 0; i-- )  
	     {
	          first = 0; 
	          for(j = 1; j <= i; j ++)
	          {
	               if(Math.abs(A[j]) > Math.abs(A[first]) )         
	                 first = j;
	          }
	          temp = A[first];
	          A[first] = A[i];
	          A[i] = temp; 
	      }  
		 for (int number : A) {
			   System.out.print(number + " ");
			   }
	}
}
