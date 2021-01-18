import java.util.Arrays;
import java.util.Scanner;

public class Uzd08 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int[] array3 = new int[5];

		for (int i = 0; i < 3; i++) {
			System.out.print("Iveskite reiksme 1 masyvo: " + " ");
			int reiksme1 = reader.nextInt();
			array1[i] = reiksme1;
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("Iveskite reiksme 2 masyvo: " + " ");
			int reiksme2 = reader.nextInt();
			array2[i] = reiksme2;
		}
		for (int i = 0; i < 3; i++) {
			array3[i] = array1[i] * array2[i];
		}

		System.out.println(Arrays.toString(array3));
	}
}
