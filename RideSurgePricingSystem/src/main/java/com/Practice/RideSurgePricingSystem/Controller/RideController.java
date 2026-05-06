package com.Practice.RideSurgePricingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Practice.RideSurgePricingSystem.ResponseDTO.RideResponse;
import com.Practice.RideSurgePricingSystem.Service.RideService;

@RestController
public class RideController {

	
	@Autowired
	private RideService service;
	
	@GetMapping("/api/rides/surge")
	
	public RideResponse getSurgeRides()
	{
		return service.getSurgeRides();
	}

}
