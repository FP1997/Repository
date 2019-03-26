import java.util.Scanner;
public class Pierwiastki {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Równanie kwadratowe.");
		double delta;
		Obliczenia r = new Obliczenia(1.1, 4.98, 6.23);
		delta = r.delta(r);
		System.out.println("Delta wynosi: " + delta);
		r.pierwiastki(r);
		
		System.out.print("Podaj wspó³czynnik a: ");
		double a = in.nextDouble();
		System.out.println();
		System.out.print("Podaj wspó³czynnik b: ");
		double b = in.nextDouble();
		System.out.println();
		System.out.print("Podaj wspó³czynnik c: ");
		double c = in.nextDouble();
		
		r = new Obliczenia(a, b, c);
		
		System.out.println("Delta wynosi: " + r.delta(r));
		r.pierwiastki(r);
		
		r.seta(2.41);
		r.seta(11.71);
		r.seta(4.62);
		
		System.out.println("Delta wynosi: " + r.delta(r));
		r.pierwiastki(r);

	}

}
