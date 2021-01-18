import java.util.Arrays;

public class Uzd15 {

	public static void main(String[] args) {

		double suma1 = 0;
		double vidurkis1 = 0;
		double vidurkis2 = 0;
		double pabrangintuPrekiuKainuSuma = 0;
		double nebrangintuPrekiuKainuSuma = 0;

		double[] prekes = new double[200];
		for (int i = 0; i < prekes.length; i++) {
			prekes[i] = random(13, 108);
			suma1 = suma1 + prekes[i];
		}

		vidurkis1 = Math.floor(suma1) / 200;
		System.out.println("kainu vidurkis pries pabrangima " + Math.floor(suma1) / 200);

		for (int i = 0; i < prekes.length; i++) {
			if (prekes[i] < vidurkis1) {
				pabrangintuPrekiuKainuSuma = (prekes[i] * 1.2) + pabrangintuPrekiuKainuSuma; // tarkim, branginama per
																								// 20%;
			} else {
				nebrangintuPrekiuKainuSuma = nebrangintuPrekiuKainuSuma + prekes[i];
			}
		}

		vidurkis2 = Math.floor(nebrangintuPrekiuKainuSuma + pabrangintuPrekiuKainuSuma) / 200;

		System.out.println("kainu vidurkis po pabrangimo " + vidurkis2);
	}

	private static double random(double min, double max) {
		return (Math.random() * (max - min) + min);
	}

}
