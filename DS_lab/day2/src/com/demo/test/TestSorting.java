package com.demo.test;

import java.util.Arrays;

import com.demo.service.BubbleSort;
import com.demo.service.SelectionSort;

public class TestSorting {

	public static void main(String[] args) {
		int[] arr= {5,2,7,8,1,3};
		int[] arr2= {1,2,3,5,6,7};
		System.out.println("before-"+Arrays.toString(arr));
		

		
//		BubbleSort.bubbleSort(arr);  //more comparisions
//		System.out.println("after-"+Arrays.toString(arr));
		
		BubbleSort.bubbleSort2(arr); //limited comparisions
		System.out.println("after-"+Arrays.toString(arr));
		
//		BubbleSort.improvedBubbleSort(arr2); //improved Bubble sort
//		System.out.println("improved BS,after-"+Arrays.toString(arr));
		
		
	}

}
