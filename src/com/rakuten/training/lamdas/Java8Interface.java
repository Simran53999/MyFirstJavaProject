package com.rakuten.training.lamdas;

interface I1 {
	public default void m1() {
		System.out.println("I1 m1");
	}
}

interface I2 {
	public default void m1() {
		System.out.println("I2 m1");
	}
}

public interface Java8Interface extends I1, I2 {
	@Override
	default void m1() {

		System.out.println("Child m1");
	}
}


class SomeClass implements I1,I2{
	@Override
	public void m1() {
		System.out.println("Some class m1");
	}
}