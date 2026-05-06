package com.Practice.RideSurgePricingSystem.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Practice.RideSurgePricingSystem.Entity.Ride;
import com.Practice.RideSurgePricingSystem.ResponseDTO.RideResponse;

/**
 * 
public RideResponse getSurgeRides()

Business Logic

peakTime true
demand greater than 50

Processing

Increase fare by 25 percent

Response Building

RideResponse {
totalRides
totalFare
surgeRides
}
 */


@Service
public class RideService {

	
	List<Ride> rides=Arrays.asList(
			
			new Ride(1, 200, true, 60),
			new Ride(2, 150, false, 40),
			new Ride(3, 300, true, 80)
			
			);
	public RideResponse getSurgeRides() {
		List<Ride> result=rides.stream()
				.filter(r->r.isPeakTime()==true)
				.filter(r->r.getDemand()>50)
				.map(r->{
					double fare=r.getFare();
					r.setFare(fare*1.25);
					return r;
				})
				.toList();
		
		double totalFare=result.stream()
				.mapToDouble(Ride::getFare)
				.sum();
		return new RideResponse(result.size(), totalFare, result);
	}

}
