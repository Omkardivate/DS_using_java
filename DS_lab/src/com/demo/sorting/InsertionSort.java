package com.demo.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int n=arr.length;
		int it=0;
		for(int i=1;i<n;i++) {
			it++;
			int shift=0;
			int key= arr[i];
			int j=i-1;
			
			for(;j>=0 && arr[j]>key ;j--) {
				arr[j+1]=arr[j];
				shift++;
			}
			arr[j+1]=key;
			System.out.println("iteration="+it+" & shift="+ shift);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {5,2,7,8,1,3};
		System.out.println("before-"+Arrays.toString(arr));
		
		insertionSort(arr);
		System.out.println("after insertion sort-"+Arrays.toString(arr));

	}

}
