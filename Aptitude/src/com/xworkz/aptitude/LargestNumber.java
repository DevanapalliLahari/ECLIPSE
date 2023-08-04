package com.xworkz.aptitude;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numb = { 20, 37, 83, 92, 43, 29 };
		
		for(int i=0;i<numb.length;i++) 
		{
			for(int j=i+1;j<numb.length;j++)
			{
				if(numb[i]>numb[j])
				{
					int temp;
					temp=numb[i];
					numb[i]=numb[j];
					numb[j]=temp;
				}
			}
			System.out.println(numb[i]);
		}
			System.out.println("First Largest number:"+numb[numb.length-1]);
			System.out.println("Second Largest number:"+numb[numb.length-2]);
			System.out.println("First smallest number:"+numb[0]);
			System.out.println("second smallest number:"+numb[1]);
	}

}
