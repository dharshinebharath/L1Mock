package com.Practice.RideSurgePricingSystem.ResponseDTO;

import java.util.List;

import com.Practice.RideSurgePricingSystem.Entity.Ride;

public class RideResponse {

	private int totalRides;
	private double totalFare;
	private List<Ride> surgeRides;
	public RideResponse(int totalRides, double totalFare, List<Ride> surgeRides) {
		super();
		this.totalRides = totalRides;
		this.totalFare = totalFare;
		this.surgeRides = surgeRides;
	}
	
	public int getTotalRides() {
		return totalRides;
	}
	public void setTotalRides(int totalRides) {
		this.totalRides = totalRides;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	public List<Ride> getSurgeRides() {
		return surgeRides;
	}
	public void setSurgeRides(List<Ride> surgeRides) {
		this.surgeRides = surgeRides;
	}
	
	
}
