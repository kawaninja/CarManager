package ru.com.kawaninja.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
	}

	@Override
	public boolean isReadyToService() {

		if (distanceOnServise > 10000) {
			return true;
		}
		return false;
	}
}
