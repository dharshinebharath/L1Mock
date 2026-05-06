package com.Practice.RideSurgePricingSystem.Entity;

public class Ride {

	private int id;
	private double fare;
	private boolean peakTime;
	private int demand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public boolean isPeakTime() {
		return peakTime;
	}
	public void setPeakTime(boolean peakTime) {
		this.peakTime = peakTime;
	}
	public int getDemand() {
		return demand;
	}
	public void setDemand(int demand) {
		this.demand = demand;
	}
	public Ride(int id, double fare, boolean peakTime, int demand) {
		super();
		this.id = id;
		this.fare = fare;
		this.peakTime = peakTime;
		this.demand = demand;
	}
	
	
}
