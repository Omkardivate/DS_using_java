package com.demo.lab1;

public class TestRecursion {

	public static int addNums(int[] arr, int n) {
		if(arr[n]==1)
			return 1;
		
		return arr[n]+addNums(arr, n-1);
	}
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=arr.length-1;
		int sum= addNums(arr, n);
		
		System.out.println("sum="+sum);

	}

}
