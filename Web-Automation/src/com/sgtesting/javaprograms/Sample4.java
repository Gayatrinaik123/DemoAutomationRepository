package com.sgtesting.javaprograms;

public class Sample4 {

	public static void main(String args[])
	{
		int count=0;
		for(int i=120;i>=80;i--)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		int a[]=new int[count];
		int k=0;
		for(int j=120;j>=80;j--)
		{
			if(j%2==0)
			{
				a[k]=j;
				k=k+1;
			}
		}
		for(int z=0;z<a.length;z++)
		{

			System.out.println(a[z]);
		}
	}
}








