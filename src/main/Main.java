package main;

import animals.Cat;
import animals.Bird;
import animals.Bug;

public class Main {

	public static void main(String[] args) {

		Cat george = new Cat("orange", 4);
		Bug tina = new Bug("black", 6);
		Bird coco = new Bird ("blue", 2, true);
		Bird etta = new Bird ("green", 2, false);

		
		System.out.println(george.Descrption()+": "+george.move());
		System.out.println(tina.Descrption()+": "+tina.move());
		System.out.println(coco.Descrption()+": "+coco.move());
		System.out.println(etta.Descrption()+": "+etta.move());

	}

}
