/**
 * 
 */
package com.example.kafka.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.kafkademo.repository.KafkaDummyRepository;

/**
 * @author abdare
 *
 */

@RestController
public class KafkaController {
	
	@Autowired
	private KafkaDummyRepository repository;
	
	
	@PostMapping("/postMessage")
	public String postMessage(@RequestBody String message) {
		
		return repository.postMessage(message);
	}

}
