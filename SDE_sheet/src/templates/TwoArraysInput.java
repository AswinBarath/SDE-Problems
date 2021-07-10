package templates;

import java.util.Scanner;

public class TwoArraysInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Size of Array 1:");
		int n = in.nextInt();
		System.out.println("Elements of array 1:");
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = in.nextInt();
		}
		System.out.println("Size of Array 2:");
		int m = in.nextInt();
		System.out.println("Elements of array 2:");
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = in.nextInt();
		}
		in.close();
	}

}
