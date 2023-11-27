package com.demo.sorting;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		int cmp=0,swap=0;
		int it=0;
		for(it=0;it<n-1;it++) {  // it<n-1
			
			
			for(int j=0;j<n-1;j++) {  //j<n-1
				cmp++;
				if(arr[j]>arr[j+1]) {
					swap++;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("iteration="+it+" & comparision="+cmp+" & swap="+ swap);
	}
	
	public static void bubbleSort2(int[] arr) {
		int n=arr.length;
		for(int it=0;it<n;it++) {
			int cmp=0,swap=0;
			
			
			for(int j=0;j<n-it-1;j++) {  //j<n-i-1
				cmp++;
				if(arr[j]>arr[j+1]) {
					swap++;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("iteration="+it+" & comparision="+cmp+" & swap="+ swap);
		}
	}
	
	public static void improvedBubbleSort(int[] arr) {
		int n=arr.length;
		boolean flag;
		for(int it=0;it<n;it++) {
			int cmp=0,swap=0;
			flag=false;
			for(int j=0;j<n-it-1;j++) {  
				cmp++;
				if(arr[j]>arr[j+1]) {
					swap++;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			System.out.println("iteration="+it+" & comparision="+cmp+" & swap="+ swap);
			if(!flag)
				break;
		}
	}
}
