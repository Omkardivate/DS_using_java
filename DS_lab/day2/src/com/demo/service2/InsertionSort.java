package com.demo.service2;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {12,11,13,5,6};
		
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		insertionsort(arr);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionsort(int[] arr) {
		int n=arr.length;
		//i represents begining of unsorted portion
		int it=0;
		for(int i=1;i<n;i++) {
			int cmp=0,swap=0;
			it++;
			int key=arr[i]; //the data to be inserted into sorted part
			int j=i-1;      //end of sorted portion
			//move the elements of arr[0..i-1], that are > key
			//one location on the right side
			//till j>0
			for(;j>=0 && arr[j]>key;j--) {
				arr[j+1]=arr[j];
				cmp++;
				swap++;
			}
			arr[j+1]=key;//assign the key in the sorted part
			System.out.println("iteration="+it+" & comparision="+cmp+" & swap="+ swap);
		}
		
	}

}