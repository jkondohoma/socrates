
package animals;


public abstract class Animal {
	
	private String color;
	private int leg_number;
	
	public Animal(String color, int leg_number) {
		
		this.color = color;
		this.leg_number = leg_number;
	}
	
	public String move() {
		return "I'm moving with " + this.leg_number + " legs!";
	}


	public String getColor() {
		return this.color;
	}


	public int getLegNumber() {
		return this.leg_number;
	}
	
	public abstract String Descrption();

}
