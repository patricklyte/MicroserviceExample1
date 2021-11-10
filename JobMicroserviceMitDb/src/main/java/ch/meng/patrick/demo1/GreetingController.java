package ch.meng.patrick.demo1;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // http://localhost:8080/greeting?name=q -> {"id":2,"content":"Hello, q!"}
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/test")
    public Greeting greeting2(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), "TEST");
    }

    // http://localhost:8080/job
    @GetMapping("/job")
    public JobEntity job(@RequestParam(value = "name", defaultValue = "Mueller") String name) {
        JobEntity job = new JobEntity();
        job.setCompany("Company");
        job.setCity("Luzern");
        job.setStreet("Teststrasse 3");
        job.setContact("Cuipid");
        return job;
    }

    //  http://localhost:8080/job2?{%22id%22:2,%22company%22:%22Company%22}
    @PostMapping("/job2")
    public JobEntity job2(@RequestBody String name) {
        JobEntity job = new JobEntity();
        job.setCompany("Company");
        job.setCity("Luzern");
        job.setStreet("Teststrasse 3");
        job.setContact("Cuipid");
        return job;
    }

    // http://localhost:8080/sendGreeting
    @GetMapping("/sendGreeting")
    public Greeting sendGreeting(@RequestBody Greeting name) {
        return new Greeting(counter.incrementAndGet(), "sendGreeting()");
    }

    // http://localhost:8080/employees
    @PostMapping("/employees")
    public Greeting createEmployee(@RequestBody Greeting employee) {
        return new Greeting(counter.incrementAndGet(), "sendGreeting()");
    }
}