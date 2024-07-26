package com.Excelr.Users_info.repository;

import com.Excelr.Users_info.entity.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<Userinfo, Integer> {

    List<Userinfo> findByJobid(long jobid);
}
