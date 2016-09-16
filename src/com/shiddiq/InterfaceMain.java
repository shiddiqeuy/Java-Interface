package com.shiddiq;


public class InterfaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boat b = new Boat();
		Car c = new Car();
		Plane p = new Plane();
		b.startEngine();
		c.startEngine();
		p.startEngine();
		b.Accelerate();
		c.Accelerate();
		p.Accelerate();
		b.brake();
		c.honk();
		p.honk();

	}

}
