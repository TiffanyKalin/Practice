
public enum Setting {
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
	private String stringValue;
	
	Setting (String value) {
		stringValue = value;
	}
	
	public String toString() {
		return stringValue;
	}
}
