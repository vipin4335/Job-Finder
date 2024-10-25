package com.vipin.JobApp1;

import com.vipin.JobApp1.model.JobPost;
import com.vipin.JobApp1.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/","home"})
    public String home() {

        return "home";
    }
    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addjob(jobPost);
        return "success";
    }
    @GetMapping("/viewalljobs")
    public String viewalljobs(Model m){
        List<JobPost> jobs=service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }

}
