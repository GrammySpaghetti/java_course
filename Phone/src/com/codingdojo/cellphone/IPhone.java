package com.codingdojo.cellphone;

public class IPhone extends CellPhone implements Ringable{
	
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

	@Override
	public void ring() {
		// TODO Auto-generated method stub
		System.out.println(super.getRingTone());
		
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println(super.getCarrier());
		System.out.println(super.getBatteryPercentage());
		System.out.println(super.getVersionNumber());
		
	}
	
}
