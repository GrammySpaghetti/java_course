package com.codingdojo.animals;

public class Gorilla extends Mammal {
	public void throwThings() {
		System.out.println("Gorilla throws poop!");
		int energy = super.getEnergyLevel();
		super.setEnergyLevel(energy-5);
		System.out.println(super.getEnergyLevel());
	}
	public void eatBananas() {
		System.out.println("Eats a banana");
		super.setEnergyLevel(super.getEnergyLevel()+10);
		System.out.println(super.getEnergyLevel());
	}
	public void climb() {
		System.out.println("Climbs a tree");
		super.setEnergyLevel(super.getEnergyLevel()-10);
		System.out.println(super.getEnergyLevel());
	}
}
