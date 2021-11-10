package ch.meng.patrick.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobDataService {
    @Autowired
    private JobRepository jobRepository;

    public List<JobEntity> list() {
        return jobRepository.findAll();
    }

    public Optional<JobEntity> getById(long id) {
        return jobRepository.findById(id);
    }
    
    public void save(JobEntity data) {
        jobRepository.save(data);
    }
}