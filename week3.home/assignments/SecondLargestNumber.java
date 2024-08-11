package week3.home.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] input = {3, 2, 11, 4, 6, 7};
		
		int length = input.length;
		
		List<Integer> itr = new ArrayList<Integer>();
		
		for (int i=0; i<input.length; i++)
		{
			Arrays.sort(input);
			itr.add(input[i]);
						
		}
		System.out.println("Second largest number in the given array is : "+ itr.get(length-2));
			

	}

}
