
public class MarginalTax {

	public final int year;
	public final String code;
	public final float start;
	public final float end;
	public final float percentage;
	
	public MarginalTax(int year, String code, float start, float end, float percentage) {
		super();
		this.year = year;
		this.code = code;
		this.start = start;
		this.end = end;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "MarginalTax [year=" + year + ", code=" + code + ", start=" + start + ", end=" + end + ", percentage="
				+ percentage + "]";
	}
	
	
	
	
	
}
