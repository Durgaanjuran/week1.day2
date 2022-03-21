package week1.day2;

import java.util.Arrays;

public class FindSecondlargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {3,2,11,4,6,7};
		Arrays.sort(array);
		
		System.out.println("first second largest number in array" +array[array.length-2]);
	}
}
