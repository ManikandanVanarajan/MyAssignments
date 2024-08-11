package week3.home.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String input1 = "stops";
		String input2 = "potss";
		
		int input1Length = input1.length();
		int input2Length = input2.length();
		System.out.println("Length of String 1 : " + input1Length);
		System.out.println("Length of String 2 : " + input2Length);
		
		char[] ch1 = input1.toCharArray();
		char[] ch2 = input2.toCharArray();
		
		boolean flag = true;
		
		if (input1Length==input2Length)
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			flag = Arrays.equals(ch1, ch2);
			
			System.out.println(ch1);
			System.out.println(ch2);
			
			if (flag==true)
			{
				System.out.println("The given strings are Anagram");
			}else{
				System.out.println("The given strings are not an Anagram");
			}
		}else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

	}

}
