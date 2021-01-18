import java.util.Scanner;

public class Uzd07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		int[] array1 = new int[5];
		int[] array2 = new int[5];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Iveskite masyvo elemento reiksme");
			int x1 = reader.nextInt();
			array1[i] = x1;
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Iveskite masyvo elemento reiksme");
			int x2 = reader.nextInt();
			array2[i] = x2;
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array1[i]+array2[i]);
		}
	}
}
