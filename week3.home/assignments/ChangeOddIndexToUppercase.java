package week3.home.assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String input = "changeme";
		//Converting String to Char array
		char[] ch = input.toCharArray();
		
		//Initiating for loop for Iterating
		for (int i=0; i<ch.length; i++)
		{
			if (i%2==1)
			{
				char ch1 = (ch[i]);
		        char upperCase = Character.toUpperCase(ch1);
		        System.out.print(upperCase);			
			} else {
				System.out.print(ch[i]);
			}
		}
			

	}

}
