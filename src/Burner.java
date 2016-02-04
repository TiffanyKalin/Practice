

public class Burner {
	public Burner() {
		super();
		temp = Temperature.COLD;
		setting = Setting.OFF;
	}

	public enum Temperature {HOT, WARM, COLD};
	private Temperature temp;
	private Setting setting;
	private int timer;
	private static final int TIME_DURATION = 2;
	
	public Temperature getTemp() {
		return temp;
	}
	
	public void increaseSetting () {
		switch(this.setting) {
		case OFF:
			this.setting = Setting.LOW;
			timer += TIME_DURATION;
			break;
		case LOW:
			this.setting = Setting.MEDIUM;
			timer += TIME_DURATION;
			break;
		case MEDIUM:
			this.setting = Setting.HIGH;
			timer += TIME_DURATION;
			break;
		case HIGH:
			System.out.println("Burner already at highest setting");
			break;
		}
	}
	
	public void decreaseSetting () {
		switch(this.setting) {
		case OFF:
			System.out.println("Burner already off");
			break;
		case LOW:
			this.setting = Setting.OFF;
			timer += TIME_DURATION;
			break;
		case MEDIUM:
			this.setting = Setting.LOW;
			timer += TIME_DURATION;
			break;
		case HIGH:
			this.setting = Setting.MEDIUM;
			timer += TIME_DURATION;
			break;
		}
	}
	
	public void updateTemperature () {
		System.out.println("hi git");
	}
	
	public void display () {
		
	}
	
}
