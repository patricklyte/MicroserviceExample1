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
		locationDataService.save(LocationEntityMother.horw());
		locationDataService.save(LocationEntityMother.luzern());

		List<LocationEntity> entities = locationDataService.list();
		Assert.isTrue(2==entities.size(), "");
		logger.debug("test");
	}

}
