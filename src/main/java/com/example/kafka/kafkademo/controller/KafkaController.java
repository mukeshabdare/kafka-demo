/**
 * 
 */
package com.example.kafka.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abdare
 *
 */

@RestController
public class KafkaController {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	@PostMapping("/postMessage")
	public String postMessage(@RequestBody String message) {
		
		kafkaTemplate.send("topic0",message);
		
		return "Message sent";
	}

}
