public class _DriveTax {

	
	
	
	public static void main(String[] args) {
		
		
		
		float taxPercentage = TaxCalculator.process("MFS", 50_000f, 
				TaxRepository::getTaxRules);
		
		System.out.println(taxPercentage);
	}

}
