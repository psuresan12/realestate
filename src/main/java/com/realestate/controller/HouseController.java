package com.realestate.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.realestate.model.House;

@RestController
@RequestMapping("api/v1/")
public class HouseController {
	
	@RequestMapping(value = "houses", method = RequestMethod.GET)
	public List<House> list() {
		return HouseStub.list();
	}

	@RequestMapping(value = "houses", method = RequestMethod.POST)
	public House create(@RequestBody House House) {
		return HouseStub.create(House);
	}

	@RequestMapping(value = "houses/{id}", method = RequestMethod.GET)
	public House get(@PathVariable Long id) {
		return HouseStub.get(id);
	}

	@RequestMapping(value = "houses/{id}", method = RequestMethod.PUT)
	public House update(@PathVariable Long id, @RequestBody House House) {
		return HouseStub.update(id, House);
	}

	@RequestMapping(value = "houses/{id}", method = RequestMethod.DELETE)
	public House delete(@PathVariable Long id) {
		return HouseStub.delete(id);
	}
	
}

