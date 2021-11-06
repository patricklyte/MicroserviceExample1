package ch.meng.patrick.demo1;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class JpaTest {
	private static final Logger logger = LoggerFactory.getLogger(JpaTest.class);

	@Autowired
	private LocationDataService locationDataService;

	@Test
	void createAndReadDataTest() {

		LocationEntity data1 = new LocationEntity();
		data1.setZip("a");
		data1.setName("b");
		locationDataService.save(data1);

		LocationEntity data2 = new LocationEntity();
		data2.setZip("a2");
		data2.setName("b2");
		locationDataService.save(data2);

		List<LocationEntity> entities = locationDataService.list();
		Assert.isTrue(entities.size()==2, "");
		logger.debug("test");
	}

}
