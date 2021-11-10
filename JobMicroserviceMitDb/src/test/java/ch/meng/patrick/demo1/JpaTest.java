package ch.meng.patrick.demo1;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@SpringBootTest
class JpaTest {
	private static final Logger logger = LoggerFactory.getLogger(JpaTest.class);

	@Autowired
	private JobDataService jobDataService;

	@Test
	void createAndReadDataTest() {

		JobEntity data1 = new JobEntity();
		data1.setCompany("a");
		data1.setStreet("b");
		jobDataService.save(data1);

		JobEntity data2 = new JobEntity();
		data2.setCompany("a2");
		data2.setStreet("b2");
		jobDataService.save(data2);

		List<JobEntity> entities = jobDataService.list();
		Assert.isTrue(entities.size()==2, "");
		logger.debug("test");
	}

}
