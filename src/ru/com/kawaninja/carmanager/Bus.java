package ru.com.kawaninja.carmanager;

public class Bus extends Car {

	public Bus(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
	}

	@Override
	public boolean isReadyToService() {
		return false;
	}

}

// My first sincro from PC
