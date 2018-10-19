package com.realestate.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.realestate.model.House;
import com.realestate.repository.HouseRepository;

@RestController
@RequestMapping("api/v1/")
public class HouseController {
	
	@Autowired
	private HouseRepository houseRepository;
	
	 @Bean
	 public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/*").allowedOrigins("*");
	            }
	        };
	    }
	
	 @CrossOrigin(origins = "*")
	 @RequestMapping(value = "houses", method = RequestMethod.GET)
	public List<House> list() {
		return houseRepository.findAll();
	}

	 @CrossOrigin(origins = "*")
	 @RequestMapping(value = "houses", method = RequestMethod.POST)
	public House create(@RequestBody House house) {
		return houseRepository.saveAndFlush(house);
	}

	 @CrossOrigin(origins = "*")
	 @RequestMapping(value = "houses/{id}", method = RequestMethod.GET)
	public House get(@PathVariable Long id) {
		return houseRepository.getOne(id);
	}

	 @CrossOrigin(origins = "*")
	 @RequestMapping(value = "houses/{id}", method = RequestMethod.PUT)
	public House update(@PathVariable Long id, @RequestBody House house) {
		House existingHouse = houseRepository.getOne(id);
		BeanUtils.copyProperties(house, existingHouse);
		return houseRepository.saveAndFlush(existingHouse);
	}

	 @CrossOrigin(origins = "*")
	 @RequestMapping(value = "houses/{id}", method = RequestMethod.DELETE)
	public House delete(@PathVariable Long id) {
		House existingHouse = houseRepository.getOne(id);
		houseRepository.delete(existingHouse);
		return HouseStub.delete(id);
	}
	
}

