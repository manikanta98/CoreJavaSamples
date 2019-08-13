import java.util.Arrays;
import java.util.Scanner;

public class Happy {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = s.nextInt();
		int[] myArray = new int[length];
		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < length; i++) {
			myArray[i] = s.nextInt();

		}

		// System.out.println(Arrays.toString(myArray));

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (myArray[i] > myArray[j]) {
					int temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;

				}
			}
		}

		System.out.println();
		int min,max;
		min=myArray[0];
		max=myArray[length-1];
		
		/*
		 * System.out.println(myArray[0]); System.out.println(myArray[length-1]);
		 */
		
		System.out.println(min);
		System.out.println(max);

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < length; i++) {
			/*
			 * System.out.printf("min",+myArray[0]);
			 * System.out.printf("max",+myArray[length-1]);
			 */
			System.out.print(myArray[i] + " ");
					}
		

	}
	
}