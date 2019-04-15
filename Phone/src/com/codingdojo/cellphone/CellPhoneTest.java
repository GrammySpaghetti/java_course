package com.codingdojo.cellphone;

public class CellPhoneTest {
	public static void main(String[] args) {
		IPhone i = new IPhone("IPhone X", 100, "ATT", "Ding Dong");
		i.displayInfo();
		i.unlock();
		i.ring();
		Galaxy g = new Galaxy("Galaxy S9", 10, "Verizon", "Answer the damn phone");
		g.displayInfo();
		g.unlock();
		g.ring();
	}
}
