/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Abdi Mohammed
 */
public class Bird extends Animal{
    public Bird() {
		super();
		System.out.println("Bird is created");
	}

	@Override
	public void sleep() {
		System.out.println("Bird is sleeping");
	}

	@Override
	public void eat() {
		System.out.println("Bird is eating\n");
	}
    
}
