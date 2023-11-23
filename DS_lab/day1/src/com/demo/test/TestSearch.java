package com.demo.test;
import java.util.Scanner;

import com.demo.service.*;

public class TestSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearSearch ls=new LinearSearch();
		int[] arr= { 2,8,4,7,5,3,9,1,22};
		int[] arr1= { 1,2,3,4, 5 ,7,8,9,22};
		
		System.out.print("enter no to search: ");
		int search=sc.nextInt();
		
		//Linear Search
//		int pos=ls.lSearch(arr,search);
//		System.out.print( search+" is at position: "+ pos);

		//Binary Search
//		int pos=BinarySearch.bSearch(arr1, search);
//		System.out.print( search+" is at position: "+ pos);
		
		//Binary Search- Recursion
		int pos=BinarySearch.bSearchRec(arr1,  0, arr1.length-1, search );
		System.out.print( search+" is at position: "+ pos);
	}


}
