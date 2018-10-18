package com.realestate.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.realestate.model.House;
import com.realestate.repository.HouseRepository;

@RestController
@RequestMapping("api/v1/")
public class HouseController {
	
	@Autowired
	private HouseRepository houseRepository;
	
	@RequestMapping(value = "houses", method = RequestMethod.GET)
	public List<House> list() {
		return houseRepository.findAll();
	}

	@RequestMapping(value = "houses", method = RequestMethod.POST)
	public House create(@RequestBody House house) {
		return houseRepository.saveAndFlush(house);
	}

	@RequestMapping(value = "houses/{id}", method = RequestMethod.GET)
	public House get(@PathVariable Long id) {
		return houseRepository.getOne(id);
	}

	@RequestMapping(value = "houses/{id}", method = RequestMethod.PUT)
	public House update(@PathVariable Long id, @RequestBody House house) {
		House existingHouse = houseRepository.getOne(id);
		BeanUtils.copyProperties(house, existingHouse);
		return houseRepository.saveAndFlush(existingHouse);
	}

	@RequestMapping(value = "houses/{id}", method = RequestMethod.DELETE)
	public House delete(@PathVariable Long id) {
		House existingHouse = houseRepository.getOne(id);
		houseRepository.delete(existingHouse);
		return HouseStub.delete(id);
	}
	
}

