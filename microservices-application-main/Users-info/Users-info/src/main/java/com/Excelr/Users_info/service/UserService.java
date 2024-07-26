package com.Excelr.Users_info.service;

import com.Excelr.Users_info.entity.Userinfo;
import com.Excelr.Users_info.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    public Userinfo addUsers(Userinfo userinfo) {
        return  repo.save(userinfo);
    }

    public List<Userinfo> getAllUsers() {
        return  repo.findAll();
    }

    public List<Userinfo> getUsersByJobid(long jobid) {
        return repo.findByJobid(jobid);
    }
}
