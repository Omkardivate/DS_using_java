package com.demo.service;

public class BinarySearch {
	static int scmp=0;
	
	public static int bSearch(int[] arr,int search) {
		int cmp=0,first=0,last=arr.length-1;
		
		while(first<=last) {
			int mid=(first+last)/2;
			cmp++;
			if(arr[mid]==search) {
				System.out.println("compare="+ cmp);
				return mid;
			}
			else if(arr[mid]<search)
				first=mid+1;
			else
				last=mid-1;
		}
		System.out.println("compare="+ cmp);
		return -1;
	}

	public static int bSearchRec(int[] arr,int first,int last, int search) {
			
			int mid=(first+last)/2;
			
			if(first>last)
				return -1;
			
			else {
				scmp++;
				if(arr[mid]==search) {
					System.out.println("compare="+ scmp);
					return mid;
				}
				else if(arr[mid]<search)
					return bSearchRec(arr,mid+1,last,search);
				else
					return bSearchRec(arr,first,mid-1,search);
			}
		
	}
}
