package com.ecommerce.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapitwo")
public class HobbyController {
	
	@Autowired
	HobbyService hobbyService;
	
	@RequestMapping("/hobby/{personId}")
	public String findByPersonId(@PathVariable int personId)
	{
		return hobbyService.findByPersonId(personId);
	}

	@RequestMapping(method=RequestMethod.POST, value="/hobby")
	public void addHobby(@RequestBody HobbyEntity he)
	{
		hobbyService.addHobby(he);
	}
	
}
