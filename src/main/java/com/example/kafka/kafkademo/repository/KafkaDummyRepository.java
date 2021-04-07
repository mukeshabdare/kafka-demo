/**
 * 
 */
package com.example.kafka.kafkademo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author abdare
 *
 */

@Repository
public class KafkaDummyRepository {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public String postMessage(String message) {
		
		kafkaTemplate.send("topic0",message);
		
		return "Message sent";
		
	} 

}
