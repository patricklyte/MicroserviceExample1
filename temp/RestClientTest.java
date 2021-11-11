package ch.meng.jobeffects;

import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import unirest.HttpResponse;
import unirest.Unirest;

class RestClientTest {
    protected static final Logger logger = LogManager.getLogger();

    @Test
    void getDataTest() {
        logger.debug("getDataTest");
        try {
            RestClient restClient = new RestClient();
            restClient.getData();
        } catch (Exception exception) {
            logger.debug(exception);
        }
    }

    @Test
    void getUnirestTest() {
        try {
            HttpResponse<String> response = Unirest.get("http://localhost:8080/job").asString();
            logger.debug("---- ANSWER ----");
            logger.debug(response.getHeaders());
            logger.debug(response.getStatusText());
            logger.debug(response.getStatus());
            logger.debug(response.getBody());
        } catch (Exception exception) {
            logger.debug(exception);
        }
    }

    @Test
    void getUnirestTest2() {
        try {
            HttpResponse<String> response = Unirest.post("http://localhost:8080/test/poststring").body("Test!!!").asString();
            logger.debug("---- ANSWER ----");
            logger.debug(response.getHeaders());
            logger.debug(response.getStatusText());
            logger.debug(response.getStatus());
            logger.debug(response.getBody());
        } catch (Exception exception) {
            logger.debug(exception);
        }
    }

    @Test
    void sendJobAsJson() {
        //Job job = new Gson().toJson(new Job());
        try {
//            JacksonObjectMapper om = new JacksonObjectMapper();
//            Unirest.config().setObjectMapper((ObjectMapper) om);
            Job testjob = new Job();
            testjob.setCompany("Testcompany");
            testjob.setContact("Testcontact");
            Unirest.post("http://localhost:8080/test/postjob")
                    .header("Content-Type", "application/json")
                    .body(new Gson().toJson(testjob))
                    .asEmpty();
//            logger.debug("---- ANSWER ----");
//            logger.debug(response.getHeaders());
//            logger.debug(response.getStatusText());
//            logger.debug(response.getStatus());
//            logger.debug(response.getBody());
        } catch (Exception exception) {
            logger.debug(exception);
        }
    }

    @Test
    void receiveJobFromJson() {
        try {
            HttpResponse<String> response = Unirest.get("http://localhost:8080/job").asString();
            logger.debug("---- ANSWER ----");
            logger.debug(response.getHeaders());
            logger.debug(response.getStatusText());
            logger.debug(response.getStatus());
            logger.debug(response.getBody());
            Job receivedJob = new Gson().fromJson(response.getBody(), Job.class);
            logger.debug(receivedJob.getCompany());
        } catch (Exception exception) {
            logger.debug(exception);
        }
    }

//    @Test
//    public void shouldReturnStatusOkay() {
//        HttpRequest test;
//        HttpResponse<JsonNode> jsonResponse
//                = null;
//        try {
//            jsonResponse = Unirest.get("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154")
//            .header("accept", "application/json").queryString("apiKey", "123")
//            .asJson();
//        } catch (UnirestException e) {
//            e.printStackTrace();
//        }
//
//        assertNotNull(jsonResponse.getBody());
//        assertEquals(200, jsonResponse.getStatus());
//    }

}