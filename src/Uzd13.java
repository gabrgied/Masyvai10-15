import java.util.Scanner;

public class Uzd13 {

	public static void main(String[] args) {

		int n = 20;

		int[] arrD = new int[n];
		int[] arrE = new int[n];
		for (int i = 0; i < n; i++) {
			arrD[i] = Random.random(-10, 10);
			System.out.print(arrD[i] + " ");
		}

		System.out.println();
		int counter = 0;
		for (int i = 0; i < arrD.length; i++) {
			if (arrD[i] > 0) {
				arrE[counter++] = arrD[i];
			}
		}

		for (int i = 0; i < counter; i++) {
			System.out.print(arrE[i] + " ");
		}

	}

}
