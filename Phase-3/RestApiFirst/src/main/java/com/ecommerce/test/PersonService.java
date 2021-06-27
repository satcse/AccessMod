package com.ecommerce.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	RestTemplate restTemplate = new RestTemplate(); // For communicating with Microservice No:2 from this microservice.

	public void addPerson(PersonEntity pe) {
		personRepository.save(pe);
	}

	public PersonResponse getPerson(int personId) {
		final String uri = "http://localhost:8082/webapitwo/hobby/{personId}";

		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("personId", personId);

		String result = restTemplate.getForObject(uri,String.class,params); // Data from Microservice No:2
		
		PersonEntity pe = personRepository.findById(personId).get(); // Data from Microservice No:1
		PersonResponse pr = new PersonResponse();
		pr.setPersonId(pe.getPersonId());
		pr.setName(pe.getName());
		pr.setAge(pe.getAge());
		pr.setHobby(result);
		
		return pr;
	}

}
