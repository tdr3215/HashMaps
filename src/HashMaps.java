import java.util.*;

public class HashMaps {
	public static void main(String[] args) {
		
		HashMap<String, Integer> grades = new HashMap<>();
//		Add data to HashMap
		grades.put("John", 45);
		grades.put("Joe", 85);
		grades.put("Karen", 73);
		grades.put("Larry", 45);

//		Add get a specific property's value
		Integer larrysGrade = grades.get("Larry");
		System.out.println(larrysGrade);

//		Remove properties from HashMap
		grades.remove("Karen");
		
//		Contains value || Contains key || Is empty
		Boolean isLarry = grades.containsKey("Larry");
		System.out.println(isLarry);
		
		Boolean hasFailed = grades.containsValue(30);
	    System.out.println(hasFailed);
	    
	    Boolean empty = grades.isEmpty();
	    System.out.println(empty);

		System.out.println(grades);
	}

}
