package main;

import animals.Cat;
import animals.Bug;

public class Main {

	public static void main(String[] args) {
		
		Cat george = new Cat("Orange", 4);
		Bug tina = new Bug("Black", 6);
		
		System.out.println(george.move());
		System.out.println(tina.move());
		

	}
	

}
