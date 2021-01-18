import java.util.Arrays;
import java.util.Scanner;

public class Uzd12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = 8;
		int[] array = new int[n];

		System.out.println("Iveskite intervalo pradzia");
		int min = reader.nextInt();
		System.out.println("Iveskite intervalo pabaiga");
		int max = reader.nextInt();
		System.out.println("Kelinta masyvo elementa pakeisti?");
		int k = reader.nextInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = random(min, max);
			/*
			 * if (i == k) { //galima su ciklu,bet yra paprastesnis variantas zemiau
			 * array[i] = 100; }
			 */
		}
		array[k] = 100;
		System.out.println(Arrays.toString(array));
	}

	private static int random(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}
}