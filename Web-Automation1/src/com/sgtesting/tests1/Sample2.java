package com.sgtesting.tests1;

public class Sample2 {
	
	
		public static void main(String args[])
			{
				int count=0;
				for(int i=1;i<=100;i++)
				{
					if(i%6==0)
					{
						count=count+1;
					}
				}
						int a[]=new int[count];
						int k=0;
						for(int j=1;j<=100;j++)
						{
							if(j%6==0)
							{
								a[k]=j;
								k=k+1;
							}
						}
						for(int z=a.length-1;z>=0;z--)
							System.out.println(a[z]);
					
			 }
	}
						




				


