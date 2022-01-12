package com.sgtesting.javaprograms;

public class Sample6 {
	
		public static void main(String args[])
			{
				int count=0;
				for(int i=71;i>=51;i--)
				{
					if(i%2!=0)
					{
						count=count+1;
					}
				}
						int a[]=new int[count];
						int k=0;
						for(int j=71;j>=51;j--)
						{
							if(j%2!=0)
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
						




				
	  


