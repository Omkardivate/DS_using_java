package com.demo.service;

public class LinearSearch {

	public int lSearch(int[] arr,int search) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search)
				return i;
		}
		return -1;
	}
}
