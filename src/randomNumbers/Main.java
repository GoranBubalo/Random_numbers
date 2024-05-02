package randomNumbers;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// Class Random

		// NOT TRUE RANDOM NUMBERS BUT SUDO RANDOM NUMBERS
		Random random = new Random();

		// Method ====== > .nextInt(N)
		// =======> OR .nextDouble(N) and soo on
		// Will generate a random number from 0 to N-1

		// GENERATE RANDOM NUMBER
		int x = random.nextInt();
		System.out.println("And the random number is : " + x);

		// Six-sided dice ( LIMIT THE SIZE OF THE INTEGER )

		int y = random.nextInt(6) + 1;
		System.out.println("You rolled a : " + y);
		// -------------------------------------------------------
		double d = random.nextDouble();

		// Double example :
		System.out.println("Display the double: " + d);
		boolean b = random.nextBoolean();
		System.out.println(b);

		// PROJECT/ SIMULATING A 9 DICE THROWS ( numbers from 1...6)

		int freq[] = new int[7]; // int array, stores 7 elements, from 0...6
		for (int roll = 0; roll < 9; roll++) // rolls 9 times
		{
			int randomNumber = random.nextInt(6); // between 0...5
			int index = 1 + randomNumber; // number between 1...6
			freq[index]++; // increment the number
		}
		for (int i = 1; i <= 6; i++) {
			System.out.println("Throw " + freq[i] + " times of number " + i);
		}

		/*OUTPUT
		 * Throw 2 times of number 1 Throw 0 times of number 2 Throw 2 times of number 3
		 * Throw 0 times of number 4 Throw 1 times of number 5 Throw 4 times of number 6
		 */

	}
}
