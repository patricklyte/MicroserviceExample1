package ch.meng.jobeffects;

import java.util.ArrayList;
import java.util.List;

public class Jobs {
    private List<Job> jobs = new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public Jobs backup() {
        var clone = new Jobs();
        List<Job> clonedJobs = new ArrayList<>();
        clonedJobs.addAll(jobs);
        clone.setJobs(clonedJobs);
        return clone;
    }

    public void sortByCompany() {
        jobs = jobs.stream().sorted().toList();
    }

    public void sortByLocation() {
        jobs = jobs.stream().sorted((o1, o2) -> 0).toList();
    }

    public void collectOnlyWithZip() {
        jobs.stream().filter(job -> job.getZip().isEmpty()).toList();
    }

    public void mapToInt() {
        jobs.stream().mapToInt(value -> 0);
    }

}
