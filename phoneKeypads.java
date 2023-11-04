import java.util.Scanner;

public class phoneKeypads {

    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        //Meminta user untuk menginput nomor telpon dalam bentuk string
        System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		// Mengubah dari huruf ke angka
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
			else
				System.out.print(string.charAt(i));
		}
		System.out.println();
	}
	
	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else 
			return 2;

    }
}