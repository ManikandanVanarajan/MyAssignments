package week3.home.assignments;

import java.util.Arrays;

public class FindIntersectionArray {

		public static void main(String[] args) {
			
			int a[]= {1, 2, 9, 4, 8, 7};
			int b[]= {1, 2, 8, 4, 9, 7};
			
			Arrays.sort(a);
			Arrays.sort(b);
				
			Boolean status= Arrays.equals(a, b);
			if(status)
			{
				System.out.println("Arrays are Equals");
			}
			
			else
			{
				System.out.println("Arrays are UnEquals");
			}

			}

}
