public class _DriverTax {

	public static void main(String[] args) {

		float taxPercentage = TaxCalculator
				.process(2017, "SI", 10_000f, TaxRepository::getTaxRules);
		System.out.println(taxPercentage);
	}

}
