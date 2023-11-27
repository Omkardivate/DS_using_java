package com.demo.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int n= arr.length;
		int it=0;
		for(int i=0;i<n-1;i++) {  
			int cmp=0,swap=0;
			it++;
			int mid_idx=i;
			for(int j=i+1;j<n;j++) {
				cmp++;
				if(arr[j]<arr[mid_idx]) {
					swap++;
					mid_idx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mid_idx];
			arr[mid_idx]=temp;
			
			System.out.println("iteration="+it+" & comparision="+cmp+" & swap="+ swap);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {5,2,7,8,1,3};
		System.out.println("before-"+Arrays.toString(arr));
		
		SelectionSort.selectionSort(arr);
		System.out.println("after selection sort-"+Arrays.toString(arr));
	}
}
