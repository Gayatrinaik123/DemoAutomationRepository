package com.sgtesting.tests1;

public class Sample1 {

	public static void main(String args[])
			{
				int a[]=new int[10];
				int index=0;
				for(int i=1;i<=10;i++)
			
					{
				
						 a[index]=i*i*i;
						 index++;
					}
						for(int i=a.length-1;i>=0;i--)
						{
						
							System.out.println(a[i]);

						}
			 }

}


