package com.example.kafka.kafkademo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.kafka.kafkademo.repository.KafkaDummyRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaDemoApplicationTests {
	
	@Mock
	private KafkaDummyRepository repository;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testPostMessage() {
		String message = "Hello from JUnit";
		Mockito.when(repository.postMessage(message)).thenReturn("Message sent");
		assertEquals("Message sent", repository.postMessage(message));
		
	}


}
