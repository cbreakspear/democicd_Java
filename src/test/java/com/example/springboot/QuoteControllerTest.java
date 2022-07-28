package com.example.springboot;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class QuoteControllerTest {

	@Autowired
	private TestRestTemplate template;

    @Test
    public void getQuoteoftheDay() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/api/QuoteoftheDay", String.class);
        assertThat(response.getBody()).isNotBlank(); //.isNotBlank()
    }
}
