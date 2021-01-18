import java.util.Arrays;
import java.util.Scanner;

public class Uzd05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner skaitytuvas = new Scanner (System.in);
		
		int[] masyvas = {0,2,-6,3, 8, -2, 1, 12, 77, 21, -8, 12, 10, 1, -1};
		
		System.out.println(Arrays.toString(masyvas));
		
		System.out.println("Iveskite reiskme");
		int reiksme = skaitytuvas.nextInt();
		
		for (int i=0; i<masyvas.length; i++) {
			System.out.println(masyvas[i]+reiksme);
		}
	}

}
