package Bubblesort;

public class Sorting3 {
	public static void printArray(int arr[]) {
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		
		int arr[]= {10,4,2,6,5,42,1,21,133,12,};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}
	}
		printArray(arr);

}
}
