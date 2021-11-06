package ch.meng.patrick.demo1;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAdminServer
@SpringBootApplication
//@ComponentScan(basePackages = {"ch.meng.patrick.demo1"})
public class AdminMicroservice {
    public static void main(String[] args) {
        SpringApplication.run(AdminMicroservice.class, args);
    }
}
