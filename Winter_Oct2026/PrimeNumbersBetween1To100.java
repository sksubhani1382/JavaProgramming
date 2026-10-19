package com.Winter_Oct2026;

public class PrimeNumbersBetween1To100 {

	public static void main(String[] args) {
		
		for(int n=2;n<=100;n++)
		{
			int c=0;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				System.out.println(n+" ");
			}
		}
	}
}
