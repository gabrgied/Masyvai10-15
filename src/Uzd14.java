import java.util.Arrays;
import java.util.Scanner;

public class Uzd14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] arrF = new int[5];
		
		System.out.println("Kuri masyvo elementa pakeisti? ");
		int a = reader.nextInt();
		System.out.println("Su kuriuo masyvo elementu ji sukeisti? ");
		int b = reader.nextInt();

		for (int i = 0; i < arrF.length; i++) {
			arrF[i] = Random.random(-5, 10);
			System.out.print(arrF[i]+ " ");
		}
		System.out.println();
		   int temp = arrF[a];
		   arrF[a] = arrF[b];
		   arrF[b] = temp;
		   System.out.print(Arrays.toString(arrF));
	}
}
