package com.vipin.JobApp1.repo;

import com.vipin.JobApp1.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {
    List<JobPost>jobs=new ArrayList<>(Arrays.asList(
            new JobPost(101, "Java Developer", "Looking for an experienced Java developer", 3, Arrays.asList("Java", "Spring Boot", "SQL")),
            new JobPost(102, "Frontend Developer", "Skilled in modern frontend frameworks", 2, Arrays.asList("JavaScript", "React", "CSS3")),
            new JobPost(103, "Data Analyst", "Expert in data analysis and visualization", 4, Arrays.asList("Python", "SQL", "Tableau")),
            new JobPost(104, "Backend Engineer", "Backend developer with Node.js expertise", 3, Arrays.asList("Node.js", "Express", "MongoDB")),
            new JobPost(105, "DevOps Engineer", "Experience with cloud and containerization", 5, Arrays.asList("AWS", "Docker", "Kubernetes"))
    ));
    public List<JobPost> getAllJobs(){
         return jobs;
    }
    public void addJob(JobPost job){

        jobs.add(job);
        System.out.println(jobs);
    }
}
