
public enum Setting {
	//enum values and string value
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
	private String stringValue;
	
	//constructor
	Setting (String value) {
		stringValue = value;
	}
	
	//toString function
	public String toString() {
		return stringValue;
	}
}
