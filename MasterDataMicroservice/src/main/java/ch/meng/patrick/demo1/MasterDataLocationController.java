package ch.meng.patrick.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locations")
public class MasterDataLocationController {
    private static final Logger logger = LoggerFactory.getLogger(MasterDataMicroservice.class);

    // curl -X POST -H "Content-type: application/json" -d "{\"name\" : \"Horw\", \"zip\" : \"6048\"}" "http://localhost:8081/locations"
    @PostMapping(
            value = "",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String postBody(@RequestBody LocationEntity data) {
        logger.info("RECEIVED REQUEST post /locations:" + data);
        logger.info(data.getName());
        logger.info(data.getZip());
        String test = data.toString();
        return "return:" + test;
    }

    @PutMapping(
            value = "",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String putBody(@RequestBody LocationEntity data) {
        logger.info("RECEIVED REQUEST put /locations:" + data);
        logger.info(data.getName());
        logger.info(data.getZip());
        String test = data.toString();
        return "return:" + test;
    }

    @GetMapping(
            value = "",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String getBody(@RequestBody String data) {
        logger.info("RECEIVED REQUEST get /locations:" + data);
        String test = data.toString();
        return "return:" + test;
    }
}