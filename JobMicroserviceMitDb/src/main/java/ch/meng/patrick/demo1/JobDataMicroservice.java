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
public class JobDataMicroservice {
    private static final Logger logger = LoggerFactory.getLogger(JobDataMicroservice.class);

    public static void main(String[] args) {
        SpringApplication.run(JobDataMicroservice.class, args);
    }

//	@Autowired
//	private JobRepository repository;
    @Autowired
    private JobDataService jobDataService;
//    @PostConstruct
//    public void test2() {
//    }
//
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            logger.info("StartApplication...");
//
////            repository.save(new JobEntity());
////            repository.save(new JobEntity());
////            repository.save(new JobEntity());
////
////            System.out.println("\nfindAll()");
////            repository.findAll().forEach(x -> System.out.println(x));
////
////            System.out.println("\nfindById(1L)");
////            repository.findById(1l).ifPresent(x -> System.out.println(x));
////
////            System.out.println("\nfindByName('Node')");
////            repository.findByName("Node").forEach(x -> System.out.println(x));


//            JobEntity data1 = new JobEntity();
//            data1.setName("a");
//            data1.setStreet("b");
//            jobDataService.save(data1);
//
//            JobEntity data2 = new JobEntity();
//            data2.setName("a2");
//            data2.setStreet("b2");
//            jobDataService.save(data2);
//
//            JobEntity data3 = new JobEntity();
//            data3.setName("a2");
//            data3.setStreet("b2");
//            jobDataService.save(data3);
            List<JobEntity> entities = jobDataService.list();
            logger.debug("test");
            logger.info("done");
        };
    }
}
