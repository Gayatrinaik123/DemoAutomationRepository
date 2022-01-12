package com.sgtesting.javaprograms;

class Sample3
{
	public static void main(String args[])
		{
			int count=0;
			for(int i=100;i>=1;i--)
			{
				if(i%11==0)
				{
					count=count+1;
				}
			}
					int a[]=new int[count];
					int k=0;
					for(int j=100;j>=1;j--)
					{
						if(j%11==0)
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
					




			