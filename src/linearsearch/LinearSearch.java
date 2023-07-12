package linearsearch;

import java.util.Scanner;

public class LinearSearch {

	public static int linearsearch(int array[],int size,int occurance){
		int counter =0;
		for(int i=0;i<size;i++) {
			if(array[i] == occurance) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int occurance = scanner.nextInt();
		int results = linearsearch(array,n,occurance);
		System.out.println(results);

	}
}
