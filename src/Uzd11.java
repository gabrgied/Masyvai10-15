import java.util.Arrays;
import java.util.Scanner;

public class Uzd11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count=0; int suma=0;
		
		int n = 20;
		int[] array = new int[n];
	
		for (int i = 0; i < array.length; i++) {
			array[i] = Random.random(5, 18);
			if (array[i]%3==0) {
				count++;
				suma = suma + array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Masyve yra: " + count + " reiksmes(-iu), kurios dalijasi is 3");
		System.out.println("Siu reiksmiu suma lygi " + suma);
	}		
	
	
}