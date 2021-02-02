package Assignment2;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		
		  
		 
		int a[]= {2,20,34,10,12};
		int smallest=a[0];
		int largest=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		Arrays.sort(a);
		System.out.println("smallest two in the array:"+a[0]+"and"+a[1]);
		System.out.println("largest two in the array:"+a[a.length-1]+"and"+a[a.length-2]);
				
	}

}
