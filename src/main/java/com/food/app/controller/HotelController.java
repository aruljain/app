package com.food.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.food.app.model.Hotels;
import com.food.app.repo.HotelsRepo;
@CrossOrigin
@RestController
@RequestMapping("/ho")
public class HotelController {
	
	@Autowired
	HotelsRepo hotelsRepo;
	
	@GetMapping("/getallhotelsordered")
	public @ResponseBody List<Hotels> getAllHotelDetailsWithOrder()
	{
		return hotelsRepo.getOrderedHotelsList();
	}

	
	@GetMapping("/getallhotels")
	public @ResponseBody List<Hotels> getAllHotelDetails()
	{
		return hotelsRepo.findAll();
	}

}
