import java.util.Arrays;
import java.util.Scanner;

public class Uzd10 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int count = 0;
		int n = 12;
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = Random.random(0, 9);
			if (array[i] == 0) {
				count++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Masyve yra: " + count + " reiksmes(-iu), kurios lygios 0");
	}
}
