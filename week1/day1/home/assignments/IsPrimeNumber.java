package week1.day1.home.assignments;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		
		int n =20;
		int k=0;
		
		for (int i=1; i<=n; i++)
		{
			if (n%i==0)
			{
				k++;
			}
		}		
		if (k==2)
		{
			System.out.println(n +" is a Prime number");
		}
		else {
			
			System.out.println(n + " is not a Prime number");
		}
	
	}

}
