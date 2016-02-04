

public class Burner {

	public Burner() {
		super();
		temp = Temperature.COLD;
		setting = Setting.OFF;
	}
	
	public Temperature getTemp() {
		return temp;
	}
	
	public void increaseSetting () {
		switch(setting) {
		case OFF:
			setting = Setting.LOW;
			timer += TIME_DURATION;
			break;
		case LOW:
			setting = Setting.MEDIUM;
			timer += TIME_DURATION;
			break;
		case MEDIUM:
			setting = Setting.HIGH;
			timer += TIME_DURATION;
			break;
		case HIGH:
			System.out.println("Burner already at highest setting");
			break;
		}
	}
	
	public void decreaseSetting () {
		switch(setting) {
		case OFF:
			System.out.println("Burner already off");
			break;
		case LOW:
			setting = Setting.OFF;
			timer += TIME_DURATION;
			break;
		case MEDIUM:
			setting = Setting.LOW;
			timer += TIME_DURATION;
			break;
		case HIGH:
			setting = Setting.MEDIUM;
			timer += TIME_DURATION;
			break;
		}
	}
	
	public void updateTemperature () {
		timer--;
		if (timer == 0) {
			switch(this.setting) {
				case OFF:
					temp = Temperature.COLD;
					break;
				case LOW:
				case MEDIUM:
					temp = Temperature.WARM;
					break;
				case HIGH:
					temp = Temperature.HOT;
					break;
			}
		}
	}
	
	public String display () {
		return "[" + setting.toString() + "]";
	}
	
	public enum Temperature {HOT, WARM, COLD};
	private Temperature temp;
	private Setting setting;
	private int timer = 0;
	private static final int TIME_DURATION = 2;
	
}
