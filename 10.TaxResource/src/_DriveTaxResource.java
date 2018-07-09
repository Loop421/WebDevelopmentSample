import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class _DriveTaxResource {
	
	public static float temp() {
		return 3f;
	}
	
	public static float getanything() {
		return 10f;
	}
	
	public static int number() {
		return 50;
	}
	
	public static List<String> attendance(){
		List<String> students = new ArrayList<>();
		students.add("peter.parker");
		students.add("bruce.banner");
		students.add("tony.stark");
		return students;
	}
	
	public static List<Float> price() {
		List<Float> foodLists = new ArrayList<>();
		foodLists.add(19f);
		foodLists.add(15f);
		foodLists.add(5f);
		return foodLists;
	}

	public static void main(String[] args) {
		
		Supplier<Float> x = _DriveTaxResource::getanything;
		
		x.get();
		
		Supplier<Integer> z = _DriveTaxResource::number;
		
		z.get();
		
		Supplier<List<String>> attendance = _DriveTaxResource::attendance;
		
		Supplier<List<Float>> price = _DriveTaxResource::price;
		
				
	}

}
