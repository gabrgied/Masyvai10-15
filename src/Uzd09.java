import java.util.Arrays;
import java.util.Scanner;

public class Uzd09 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek masyve elementu?");
		int n = reader.nextInt();
		int[] array = new int[n];

		System.out.println("Iveskite intervalo pradzia");
		int min = reader.nextInt();
		System.out.println("Iveskite intervalo pabaiga");
		int max = reader.nextInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = Random.random(min, max);
		}
		System.out.println(Arrays.toString(array));
	}
}
