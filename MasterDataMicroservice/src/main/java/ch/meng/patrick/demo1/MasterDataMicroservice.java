package ch.meng.patrick.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MasterDataMicroservice {
    private static final Logger logger = LoggerFactory.getLogger(MasterDataMicroservice.class);
    public static final String BOOTING_MESSAGE = "Booting MasterDataMicroservice...";

    public static void main(String[] args) {
        SpringApplication.run(MasterDataMicroservice.class, args);
    }

    @Autowired
    private LocationDataService locationDataService;

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            logger.info(BOOTING_MESSAGE);
            List<LocationEntity> entities = locationDataService.list();
            logger.info(BOOTING_MESSAGE + "done");
        };
    }
}
