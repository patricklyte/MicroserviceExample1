package ch.meng.patrick.demo1;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JobObjectController {

    // curl -X POST -H "Content-type: application/json" -d "{\"company\" : \"John\", \"contact\" : \"Smith\"}" "http://localhost:8080/test/postbody"
    @PostMapping(
            value = "/postjob",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String postBody(@RequestBody JobEntity person) {
        String test = person.toString();
        //Person persistedPerson = personService.save(person);
//        return ResponseEntity
//                .created(URI
//                        .create(String.format("/persons/%s", person.getFirstName())))
//                .body(persistedPerson);
        return test;
    }
}