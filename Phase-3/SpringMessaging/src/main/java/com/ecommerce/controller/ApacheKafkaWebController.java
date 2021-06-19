package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.KafkaSender;

@RestController
@RequestMapping(value="/javamessage")
public class ApacheKafkaWebController {

	@Autowired
	KafkaSender kafkaSender;
	
	@GetMapping(value="/producer")
	public String producer(@RequestParam("message") String message)
	{
		kafkaSender.send(message);
		return "Message Sent to the simpli_learn_topic Successfully";
	}
	// Start Zookeeper -> Start Apache Kafka -> Start Kafka Consumer Console
	
	//Zookeeper - zookeeper-server-start.bat ../../config/zookeeper.properties
	//Apache Kafka - kafka-server-start.bat ../../config/server.properties
	//kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic simpli_learn_topic --from-beginning
	//Path - D:\kafka_2.13-2.8.0\bin\windows
}
