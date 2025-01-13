package Bubblesort;

public class PrintNumbers {
	public static void anyNumbers(int n) {
		if(n==6) {
			return;
	}
		System.out.println(n);
		anyNumbers(n+1);
	}
	
public static void main(String[] args) {
	int  n =1;
	anyNumbers(n);
	
}
}
