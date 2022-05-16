package animals;

public abstract class Animal {
	
	private String color;
	private int leg_number;
	
	public Animal(String color, int leg_number) {
		
		this.color = color;
		this.leg_number = leg_number;
	}
	
	
	public abstract String move();
	

}
