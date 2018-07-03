package Strings;

import java.util.Arrays;

public class Pgmk {
	public static void main(String[] args) {

		int[] arr = { 1,2,3,4,7};
		int [] arr1=new int[arr.length+1];
		int b=8,temp=0,temp1=0;
for(int i=0;i<arr.length;i++){
	if(b>arr[i]){
temp=arr[i];
temp1=b;
	}else{
	temp=b;
		temp1=arr[i];
		b=arr[i];
	}
	arr1[i]=temp;
	arr1[i+1]=temp1;
}
		System.out.println(Arrays.toString(arr1));
			
}}