package ru.com.kawaninja.carmanager;

public interface Serviceable {

	public boolean isReadyToService();

	public double getDistanceOnServise();

	public void addDistance(int additionalDistance);

	public void addDistance(double additionalDistance);
	
}
