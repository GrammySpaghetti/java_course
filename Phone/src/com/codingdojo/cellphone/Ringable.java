package com.codingdojo.cellphone;

public interface Ringable {

	void ring();
	default void unlock() {
		System.out.println("Types in 12345 and hope no one sees");
	}
}
