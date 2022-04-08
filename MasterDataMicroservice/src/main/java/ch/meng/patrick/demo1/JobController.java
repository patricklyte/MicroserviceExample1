package ch.meng.patrick.demo1;

import ch.meng.patrick.api.JobApi;
import ch.meng.patrick.dto.JobDto;
import io.micrometer.core.annotation.Timed;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Timed
@AllArgsConstructor
public class JobController implements JobApi {
    @Override
    public ResponseEntity<JobDto> getJobStatus(UUID id) {
        return JobApi.super.getJobStatus(id);
    }
}
