package com.vipin.JobApp1.service;

import com.vipin.JobApp1.model.JobPost;
import com.vipin.JobApp1.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepo repo;
    public void addjob(JobPost jobPost) {
         repo.addJob(jobPost);
    }
    public List<JobPost> getAllJobs(){
         return repo.getAllJobs();
    }
}
