import java.util.ArrayList;
import java.util.List;

public class TaxRepository {
	public static List<MarginalTax> getTaxRules(){
		List<MarginalTax> list = new ArrayList<>();
		
		list.add(new MarginalTax(2017, "SI", 0f, 9_326f, .10f));
		list.add(new MarginalTax(2017, "SI", 9_326f, 37_951f, .15f));
		list.add(new MarginalTax(2017, "SI", 37_951f, 91_909f, .25f));
		list.add(new MarginalTax(2017, "SI", 91_909f, 191_651f, .28f));
		list.add(new MarginalTax(2017, "SI", 191_651f, 416_701f, .33f));
		list.add(new MarginalTax(2017, "SI", 416_701f, 418_401f, .35f));
		list.add(new MarginalTax(2017, "SI", 418_401f, 10_000_000, .396f));
		                         
		list.add(new MarginalTax(2017, "HH", 0f, 13_351f, .10f));
		list.add(new MarginalTax(2017, "HH", 13_351f, 50_801f, .15f));
		list.add(new MarginalTax(2017, "HH", 50_801f, 131_201f, .25f));
		list.add(new MarginalTax(2017, "HH", 131_201f, 212_501, .28f));
		list.add(new MarginalTax(2017, "HH", 212_501f, 416_701f, .33f));
		list.add(new MarginalTax(2017, "HH", 416_701f, 444_551f, .35f));
		list.add(new MarginalTax(2017, "HH", 444_551f, 10_000_000, .396f));
		                         
		list.add(new MarginalTax(2017, "MFJ", 0f, 18_651f, .10f));
		list.add(new MarginalTax(2017, "MFJ", 18_651f, 75_901f, .15f));
		list.add(new MarginalTax(2017, "MFJ", 75_901f, 153_101f, .25f));
		list.add(new MarginalTax(2017, "MFJ", 153_101f, 233_351f, .28f));
		list.add(new MarginalTax(2017, "MFJ", 233_351f, 416_701f, .33f));
		list.add(new MarginalTax(2017, "MFJ", 416_701f, 470_701f, .35f));
		list.add(new MarginalTax(2017, "MFJ", 470_701f, 10_000_000, .396f));
		
		list.add(new MarginalTax(2017, "QW", 0f, 18_651f, .10f));
		list.add(new MarginalTax(2017, "QW", 18_651f, 75_901f, .15f));
		list.add(new MarginalTax(2017, "QW", 75_901f, 153_101f, .25f));
		list.add(new MarginalTax(2017, "QW", 153_101f, 233_351f, .28f));
		list.add(new MarginalTax(2017, "QW", 233_351f, 416_701f, .33f));
		list.add(new MarginalTax(2017, "QW", 416_701f, 470_701f, .35f));
		list.add(new MarginalTax(2017, "QW", 470_701f, 10_000_000, .396f));
		                          
		list.add(new MarginalTax(2017, "MFS", 0f, 9_326f, .10f));
		list.add(new MarginalTax(2017, "MFS", 9_326f, 37_951f, .15f));
		list.add(new MarginalTax(2017, "MFS", 37_951f, 76_551f, .25f));
		list.add(new MarginalTax(2017, "MFS", 76_551f, 116_676f, .28f));
		list.add(new MarginalTax(2017, "MFS", 116_676f, 208_351f, .33f));
		list.add(new MarginalTax(2017, "MFS", 208_351f, 235_351f, .35f));
		list.add(new MarginalTax(2017, "MFS", 235_351f, 10_000_000, .396f));
		
		
		return list;
	}
}
