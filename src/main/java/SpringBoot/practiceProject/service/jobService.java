package SpringBoot.practiceProject.service;

import SpringBoot.practiceProject.model.JobPost;
import SpringBoot.practiceProject.repo.jobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class jobService {

    @Autowired
    private jobRepo repo;

    public void addJob(JobPost j){
        repo.addJob(j);
    }

    public List<JobPost> getJobPost(){
        return repo.getJobPost();
    }

}
