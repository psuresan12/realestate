package com.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.realestate.model.House;

public interface HouseRepository extends JpaRepository<House, Long> {
	
	

}
