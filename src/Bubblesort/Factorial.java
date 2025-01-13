package Bubblesort;

public class Factorial {
//	public static int  cal(int n) {
//		if(n==1 || n==0) {
//			return 1;
//		}
//		int fact=cal(n-1);
//		int fact_n=n*fact;
//		return fact_n;
//		
//	}
//	
//public static void main(String[] args) {
//	int n=5;
//	int ans =cal(n);
//	System.out.println(ans);
	
//	public static int  cal(int n) {
//		if(n==1 || n==0) {
//			return 1;
//		}
//		int fact =cal(n-1);
//		int fact_n=n*fact;
//		return fact_n;
//		
//	}
//	public static void main(String[] args) {
//		int n=6;
//		int ans=cal(n);
//		System.out.println(ans);
//	}
//	
//}
	
	public static int  cal(int n) {
		if(n==1 || n==0) {
			return 1;
			
		}
		int fact=cal(n-1);
		int fact_n=n*fact;
		return fact_n;
		
		
	}
public static void main(String[] args) {
	int n =5;
	
	
	
	
	int ans=cal(n);
	System.out.println(ans);
	
}
	
}

