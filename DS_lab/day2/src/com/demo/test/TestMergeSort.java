package com.demo.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class TestMergeSort {
	static List<Integer> lst1= new ArrayList<>();
	static List<Integer> lst2= new ArrayList<>();
	
	public static void readFile() {
		String f1="file.txt",f2="file2.txt";
		
		try (BufferedReader br1= new BufferedReader(new FileReader(f1));
				BufferedReader br2= new BufferedReader(new FileReader(f2));){
			String str1=br1.readLine();
			String str2=br2.readLine();
			
			while(str1!=null) {
				Integer i1= Integer.parseInt(str1);
				lst1.add(i1);
				str1=br1.readLine();
			}
			while(str2!=null) {
				Integer i2= Integer.parseInt(str2);
				lst2.add(i2);
				str2=br2.readLine();
			}
			System.out.println("File readed successfully...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void mergeSort(int[] arr3) {
		int i=0,j=0,k=0;
		int a=lst1.size();
		int b=lst2.size();
		while(i<lst1.size() && j<lst2.size()) {
			if(lst1.get(i)<lst2.get(j)) {
				arr3[k]=lst1.get(i);
				i++;
				k++;
			}else {
				arr3[k]=lst2.get(j);
				j++;
				k++;
			}
		}
		while(i<lst1.size()) {
			arr3[k]=lst1.get(i);
			i++;
			k++;
		}
		while(j<lst2.size()) {
			arr3[k]=lst2.get(j);
			j++;
			k++;
		}
	}
	
	public static void writeFile() {
		
	}
	
	
	public static void main(String[] args) {
		int[] result=new int[11];
		
		readFile();
		mergeSort(result);
		System.out.println(Arrays.toString(result));
		
//		for(Integer i:lst1) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		for(Integer i:lst2) {
//			System.out.print(i+" ");
//		}
	}

}
