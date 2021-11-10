package ch.meng.patrick.demo1;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/test2")
public class StringController2 {


    //curl -X POST -H "Content-type: application/json" -d "John Smith" "http://localhost:8080/test/poststring"
    @PostMapping("/poststring2")
    public String postBody(@RequestBody String fullName) {
        return "Hello " + fullName;
    }
}