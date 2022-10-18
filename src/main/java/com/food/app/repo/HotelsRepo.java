package com.food.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.food.app.model.Hotels;

public interface HotelsRepo extends JpaRepository<Hotels, Integer>{
	@Query(value="from Hotels order by hotelName")
	public List<Hotels> getOrderedHotelsList();

}
