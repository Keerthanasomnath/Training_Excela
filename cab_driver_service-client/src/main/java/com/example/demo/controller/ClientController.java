package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDTO;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetailsEnitty;

@RestController
@RequestMapping(path="/client")

public class ClientController {

	@Autowired
	private TripDTO dto;
	
	
	@Autowired
	private RestTemplate template;
	 
	@GetMapping(path="/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
	}
	
	@GetMapping(path="/drivers/json")
	public CabDriver[] getDriversAsJSon() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",CabDriver[].class);
	}
	
	@GetMapping(path="/drivers/srch/{name}")
	public String getDriversByName(@PathVariable("name") String name) {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/srch/"+name,String.class);
	}
	
//	@GetMapping(path="/srch/driver/{id}")
//	public String getDriverTrips(@PathVariable("id")int id) {
//		String driver= this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id, String.class);
//	String trips = this.template.getForObject("http://TRIP-DRIVER-SERVICE/api/v1/trips/srch/drivers/"+id, String.class);
//		return driver+trips;
//		
//		}
	
	@GetMapping(path="/srch/driver/{id}")
	public TripDTO getDriverTrips(@PathVariable("id")int id) {
		
		CabDriver driver= this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id, CabDriver.class);

		TripDetailsEnitty[] trips = this.template.getForObject("http://TRIP-DRIVER-SERVICE/api/v1/trips/"+id, TripDetailsEnitty[].class);
		//return driver+trips;
		

			dto.setDriver(driver);
			List<TripDetailsEnitty>detailSet= Arrays.asList(trips);
			dto.setTrips(detailSet);


			return dto;
		}	
}
