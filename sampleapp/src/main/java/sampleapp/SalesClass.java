package sampleapp;

public class SalesClass {
	
	public void display() {
		
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for( int num:arr)
		{
			sum+=num;
			System.out.print(num);
		}
		System.out.println("Summation: "+ sum);
	}
	public void print() {
		System.out.println("print all array numbers: ");
		display();
	}
}
