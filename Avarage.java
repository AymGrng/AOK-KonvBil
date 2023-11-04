import java.util.Scanner;

public class Avarage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int positives = 0; 	// Menghitung angka positif
		int negatives = 0; 	// Menghitung angka negatif
		int count = 0;		// Menghitung semua angka
		double total = 0;	// Mengumpulkan total


		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		if (number == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}

		while (number != 0) {
			if (number > 0)
				positives++;	
			else
				negatives++;	
			total += number;	
			count++;				
			number = input.nextInt();
		}

		// Menghitung rata - rata
		double average = total / count;

		// Menampilkan hasil
		System.out.println(
			"The number of positive is " + positives +
			"\nThe number of negatives is " + negatives +
			"\nThe total is total " + total +
			"\nThe average is " + average);
	}
}
