package animals;

public class Bird extends Animal{

	private boolean can_fly;
	
	public Bird(String color, int leg_number, boolean can_fly) {
		super(color, leg_number);
		this.can_fly = can_fly;	
	}
	

	@Override
	public String move() {
		
		String statement = "I'm moving with " + getLegNumber() + " legs!";
		
		if (can_fly) {
			statement = "I'm flying";
		}
		return statement;
	}
	
	@Override
	public String Descrption() {
		
		return getColor() + " bird";
	}

}
