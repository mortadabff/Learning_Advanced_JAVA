package Enumerations;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d= Day.FRIDAY;
		System.out.println(d.getValue());
		for(Day day: Day.values()) {
			System.out.println(day.getValue());
		}
	}

}

