package week3.home.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		
		int input[] = {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> missingNum = new ArrayList<Integer>();
		
		for (int i=0; i<input.length; i++)
		{
			Arrays.sort(input);
			missingNum.add(input[i]);
						
		}
		System.out.println("Array sorted in the Ascending order : " + missingNum);
		
		System.out.println("Missing numbers are as below :");
		
		for (int j=0; j<missingNum.size()-1; j++)
		{
			if (input[j+1]!=input[j]+1)
			{
				System.out.println(missingNum.get(j)+1);
			}
		}

	}

}
