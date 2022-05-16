package animals;

public class Bug extends Animal{

	public Bug(String color, int leg_number) {
		super(color, leg_number);
	}
	
	@Override
	public String Descrption() {
		
		return getColor() + " bug";
	}

}
