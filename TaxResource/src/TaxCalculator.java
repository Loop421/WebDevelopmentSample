import java.util.List;
import java.util.function.Supplier;

import edu.citytech.cst.marginaltax.MarginalTax;

public class TaxCalculator {

	public static float process(int year, String code, float salary, Supplier<List<MarginalTax>> taxRules) {

		List<MarginalTax> rules = taxRules.get();

		float taxPercentage = 0f;

		for (MarginalTax marginalTax : rules) {
			if (marginalTax.end > salary && code.equals(marginalTax.code)) {
				taxPercentage = marginalTax.taxPercentage;
				break;
			}

		}

		return taxPercentage;

	}

}
