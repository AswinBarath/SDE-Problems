package templates;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Size of Array:");
		int n = in.nextInt();
		System.out.println("Elements of array:");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
	}

}
