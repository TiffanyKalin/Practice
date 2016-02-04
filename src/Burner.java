

public class Burner {

	//constructor 
	public Burner() {
		super();
		temp = Temperature.COLD;
		setting = Setting.OFF;
	}
	
	//temp getter
	public Temperature getTemp() {
		return temp;
	}
	
	//increase setting of burner
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
	
	//decrease setting of burner
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
	
	//update temperature based on timer
	public void updateTemperature () {
		//only decrement timer if it is greater than 0
		if (timer > 0) 
			timer--;
		//when timer is zero update temp
		else {
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
	}
	
	//display setting of stove 
	public String display () {
		return "[" + setting.toString() + "]";
	}
	
	//instance variables 
	public enum Temperature {HOT, WARM, COLD};
	private Temperature temp;
	private Setting setting;
	private int timer = 0;
	private static final int TIME_DURATION = 2;
	
}
