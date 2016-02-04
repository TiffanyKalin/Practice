import java.util.ArrayList;

public class Stove {
	public Stove() {
		super();
		burners = new ArrayList<Burner>();
		for (int i = 0; i < 4; i++) {
			Burner newBurner = new Burner();
			burners.add(newBurner);
		}
	}

	ArrayList <Burner> burners;
	
	public void displayStove () {
		System.out.println("Stove ---------------");
		for (Burner b: burners) {
			System.out.print(b.display());
			System.out.print(".....");
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
	}
	
	public static void main(String[] args) {
		Stove stove = new Stove();
		stove.displayStove();
	}

}
