package week3.home.assignments;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String[] array = test.split(" ");
		
		int k = array.length;
		System.out.println(k);
		
		for (int i=0; i<array.length; i++)
		{
			if (i%2==0) 
			{
				System.out.print(array[i] + " ");
			}
			
			else if (i%2==1)
			{
				{
					char[] ch = array[i].toCharArray();
					for (int j=ch.length-1; j>=0; j--)					
					{
						System.out.print(ch[j]);
					}
					System.out.print(" ");
				}
			}
		}
	}

}
