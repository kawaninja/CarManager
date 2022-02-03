package ru.com.kawaninja.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new PassengerCar("Toyota Prius", 2008, 1200, 15000, Color.GREEN);

		Car renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

		Car renault2 = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

		List<Car> cars = new ArrayList<>();
		cars.add(prius);
		cars.add(renault);
		cars.add(renault2);

		System.out.println(cars);

		prius.addDistance(1000);
		prius.addDistance(2000);
		prius.addDistance(20.7);
		prius.addDistance(15000);
		renault.addDistance(15000);

		System.out.println(prius);
		System.out.println(renault);

//		System.out.println(prius.equals(renault2));
//		System.out.println(renault.equals(renault2));

		System.out.println(prius.isReadyToService());
		System.out.println(renault.isReadyToService());

	}

}
