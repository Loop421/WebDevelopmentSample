import java.util.List;
import java.util.function.Supplier;

public class TaxCalculator {

	public static float process(String code,
			float salary, Supplier<List<MarginalTax>> taxes) {
		
		List<MarginalTax> rules = taxes.get();
		
		float taxPercentage = 0f;
		
		for (MarginalTax marginalTax : rules) {
			if (marginalTax.end > salary && code.equals(marginalTax.code)) {
				taxPercentage = marginalTax.percentage;
				break;
			}
			
		}
		
		return taxPercentage;
	}

}
