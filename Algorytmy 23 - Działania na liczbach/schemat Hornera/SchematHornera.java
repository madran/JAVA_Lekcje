import java.util.ArrayList;
import java.util.Collections;

public class SchematHornera {

	public static void main(String[] args) {
		ArrayList<Double> coeffs = new ArrayList<Double>();
		coeffs.add(-19.0);
		coeffs.add(7.0);
		coeffs.add(-4.0);
		coeffs.add(6.0);
		System.out.println(polyEval(coeffs, 3));
	}

	public static double polyEval(ArrayList<Double> coefficients, double x) {
		Collections.reverse(coefficients);
		Double accumulator = coefficients.get(0);
		for (int i = 1; i < coefficients.size(); i++) {
			accumulator = (accumulator * x) + coefficients.get(i);
		}
		return accumulator;
	}

}
