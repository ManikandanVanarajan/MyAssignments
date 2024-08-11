package week3.home.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collectionSort {

	public static void main(String[] args) {
		
		String[] input = {"HCL", "Wipro", "AspireSystems", "CTS"};
		
		List<String> str = new ArrayList<String>();
		
		for (int i=0; i<input.length; i++)
		{
			Arrays.sort(input);	
			str.add(input[i]);					
		}
		System.out.println(str);
		
		for (int j=str.size()-1; j>=0; j--)
		{
			System.out.print(input[j]+ " ");
			
		}	
		

	}

}
