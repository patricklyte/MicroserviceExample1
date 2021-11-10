package ch.meng.patrick.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobDataService {

    @Autowired
    private JobRepository jobRepository;

    public List<JobEntity> list() {
        return jobRepository.findAll();
    }

    public void save(JobEntity data) {
        jobRepository.save(data);
    }
}