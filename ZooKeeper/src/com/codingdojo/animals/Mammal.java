package com.codingdojo.animals;

public class Mammal {
	private boolean sleeping = false;
	private int energyLevel;
	public Mammal() {
		energyLevel = 100;
	}
    public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	public void regulateTemperature() {
        System.out.println("My temperature is just right now.");
    }
    public void startSleeping() {
        sleeping = true;
        System.out.println("ZzZz");
    }
    public boolean isSleeping(){
        return sleeping;
    }
    public int displayEnergy() {
    	System.out.println(energyLevel);
    	return energyLevel;
    }
}
