import java.util.Arrays;
import java.util.Scanner;

public class Uzd06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner (System.in);
		
		int[] array = new int[6];
		
		for (int i=0; i<array.length; i++) {
			System.out.println("Iveskite masyvo elemento reiksme");
			int x = reader.nextInt();
			array[i]=x;
		}
		System.out.println(Arrays.toString(array));
	}

}
