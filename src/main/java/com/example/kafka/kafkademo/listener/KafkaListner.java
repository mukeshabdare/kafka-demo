/**
 * 
 */
package com.example.kafka.kafkademo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author abdare
 *
 */

@Component
public class KafkaListner {

	@KafkaListener(topics = "topic0", groupId = "group-id")
	public void listen(String message) {
		System.out.println("Received Messasge in group - group-id: " + message);
	}
}
