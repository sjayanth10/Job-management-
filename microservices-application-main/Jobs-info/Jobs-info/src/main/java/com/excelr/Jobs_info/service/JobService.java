package com.excelr.Jobs_info.service;

import com.excelr.Jobs_info.Config.Fullresponse;
import com.excelr.Jobs_info.Config.Userinfo;
import com.excelr.Jobs_info.client.UserClient;
import com.excelr.Jobs_info.model.Jobs;
import com.excelr.Jobs_info.repository.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private Jobrepo repo;
    @Autowired
    private UserClient client;
    public Jobs addJob(Jobs jobs) {
        return repo.save((jobs));
    }

    public List<Jobs> getalljobs() {
        return repo.findAll();
    }

    public Fullresponse getJobWithUserInfo(long jobid) {
        Jobs jobs = repo.findByJobid(jobid);
        List<Userinfo> users= client.findByJobid(jobid);
        Fullresponse fullresponse=new Fullresponse();
        fullresponse.setJobid(jobs.getJobid());
        fullresponse.setJobtitle(jobs.getJobtitle());
        fullresponse.setJobdescription(jobs.getJobdescription());
        fullresponse.setJoblocation(jobs.getJoblocation());
        fullresponse.setJobtype(jobs.getJobtype());
        fullresponse.setJobcategory(jobs.getJobcategory());
        fullresponse.setSalary(jobs.getSalary());
        fullresponse.setExperience(jobs.getExperience());
        fullresponse.setUserinfo(users);
        return fullresponse;
    }
}
