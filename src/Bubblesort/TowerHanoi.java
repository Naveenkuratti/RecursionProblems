package Bubblesort;

public class TowerHanoi {
	
	public static void towerHanoi(int n , String src, String help, String des) {
		if(n==1) {
			System.out.println("transfer disk"+n+"from"+src+"to"+des);
			return;
		}
		towerHanoi(n-1, src, des, help);
		System.out.println("transfer disk"+n+"from"+src+"to"+des);
		towerHanoi(n-1, help, src, des);
	}
	public static void main(String[] args) {
		int n=1;
		towerHanoi(n, "S", "H", "D");
		 
	}

}
