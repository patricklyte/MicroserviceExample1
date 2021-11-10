package ch.meng.patrick.demo1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingRestController {

    @RequestMapping(method = RequestMethod.GET, path = "/api-ping")
    public ResponseEntity<String> getPing() {
        return ResponseEntity.ok("pong");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api-test")
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("pong");
    }
}
