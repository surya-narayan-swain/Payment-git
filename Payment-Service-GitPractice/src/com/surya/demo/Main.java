package com.surya.demo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main.main()");
		System.out.println("Payment-service");
		System.out.println("=======================");
		System.out.println("welcome");
		System.out.println("github");
		String str = StringReverse.reverse("SURYA");
		System.out.println(str);
		System.out.println("================");
		int arr[] = { 5, 2, 1, 4, 3, 4 };
		System.out.println(Arrays.toString(arr));
		SortArray.sortArr(arr);
		System.out.println(Arrays.toString(arr));

	}
}
