package animals;

public class Cat extends Animal{

	public Cat(String color, int leg_number) {
		super(color, leg_number);
	}

	@Override
	public String Descrption() {
		
		return getColor() + " cat";
	}
	
	

}
