package Enumerations;

public enum Day {

	MONDAY("monday"),TUESDAY("tuesday"),SATURDAY("saturday"),FRIDAY("friday"),SUNDAY("sunday"),THURSDAY("thursday"),WEDNESDAY("wednesday");

	

	private String value;

	Day(String string) {
		this.value= string;
	}

	public String getValue() {
		return value;
	}
}
