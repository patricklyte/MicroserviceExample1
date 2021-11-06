package ch.meng.patrick.demo1;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

@SpringBootTest
class MicroserviceTest {
	private static final Logger logger = LoggerFactory.getLogger(MicroserviceTest.class);

//	@Test
//	public void stringPostTest() throws URISyntaxException
//	{
//		RestTemplate restTemplate = new RestTemplate();
//		final String baseUrl = "http://localhost:8080/test/poststring";
//		URI uri = new URI(baseUrl);
//		OrtEntity employee = new OrtEntity();
//		String result = restTemplate.postForObject(uri, null, String.class);
//		//Verify request succeed
//		Assert.isTrue(true, "true");
//	}
//
//	@Test
//	public void objectPostTest() throws URISyntaxException
//	{
//		RestTemplate restTemplate = new RestTemplate();
//		final String baseUrl = "http://localhost:8080/test/postbody";
//		URI uri = new URI(baseUrl);
//		OrtEntity employee = new OrtEntity();
//		ResponseEntity<String> result = restTemplate.postForEntity(uri, employee, String.class);
//		//Verify request succeed
//		Assert.isTrue(true, "true");
//	}
//
//	@Test
//	void test() {
//		RestTemplate restTemplate = new RestTemplate();
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(headers);
//		restTemplate.exchange("http://localhost:8080/test2/poststring2", HttpMethod.GET, entity, String.class).getBody();
//	}

}
