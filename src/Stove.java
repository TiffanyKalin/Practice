import java.util.ArrayList;

public class Stove {
	//burner arraylist
	ArrayList <Burner> burners;
	
	//constructor
	public Stove() {
		super();
		burners = new ArrayList<Burner>();
		for (int i = 0; i < 4; i++) {
			Burner newBurner = new Burner();
			burners.add(newBurner);
		}
	}
	
	//display stove
	public void displayStove () {
		System.out.println("Stove ---------------");
		
		//for all burners
		for (Burner b: burners) {
			System.out.print(b.display());
			System.out.print(".....");
			
			//change statement based on temp
			switch(b.getTemp()) {
			case COLD:
				System.out.println("cooool");
				break;
			case WARM:
				System.out.println("CAREFUL");
				break;
			case HOT:
				System.out.println("HOT SURFACE! DON'T TOUCH");
				break;
			}
		}
		
		//endline
		System.out.println("");
	}
	
	//creates first display to show
	public void display1() {
		//to get to high setting for burner 1
		burners.get(0).increaseSetting();
		burners.get(0).increaseSetting();
		burners.get(0).increaseSetting();
		
		//to get to medium setting for burner 2
		burners.get(1).increaseSetting();
		burners.get(1).increaseSetting();
		
		//to get low setting for burner 3
		burners.get(2).increaseSetting();
		
		//time passing
		timePassing(6);
	}
	
	//creates second display to show
	public void display2() {
		//to get to low setting to burner 1
		burners.get(0).decreaseSetting();
		burners.get(0).decreaseSetting();
		
		//to get to hot setting for burner 2
		burners.get(1).increaseSetting();
		
		//to get to cold setting for burner 3
		burners.get(2).decreaseSetting();
		
		//time passing
		timePassing(4);
	}
	
	//create third display to show
	public void display3() {
		//to get to off setting for burner 1
		burners.get(0).decreaseSetting();
		
		//to get to medium setting for burner 2
		burners.get(1).decreaseSetting();
		
		//time passing
		timePassing(2);
	}
	
	//function to pass time and update temp
	public void timePassing (int iterations) {
		for (int i = 0; i < iterations; i++) {
			for (Burner b : burners)
				b.updateTemperature();
		}
		displayStove();
	}
	
	//main
	public static void main(String[] args) {
		Stove stove = new Stove();
		stove.displayStove();
		stove.display1();
		stove.display2();
		stove.display3();
	}

}
