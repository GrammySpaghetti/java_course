package com.codingdojo.animals;

public class Bat extends Mammal {
	public Bat() {
		super.setEnergyLevel(300);
	}
	public void fly() {
		System.out.println("Wooosh");
		super.setEnergyLevel(super.getEnergyLevel()-50);
		System.out.println(super.getEnergyLevel());
	}
	public void eatHumans() {
		System.out.println("Tasty human flesh!");
		super.setEnergyLevel(super.getEnergyLevel()+25);
		System.out.println(super.getEnergyLevel());
	}
	public void attackTown() {
		System.out.println("The sound of the town burning is like the crackling of a campfire");
		super.setEnergyLevel(super.getEnergyLevel()-100);
		System.out.println(super.getEnergyLevel());
	}
}
