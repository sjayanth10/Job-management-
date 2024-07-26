package com.excelr.Jobs_info.repository;

import com.excelr.Jobs_info.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Jobrepo extends JpaRepository<Jobs,Long> {
    Jobs findByJobid(long jobid);
}
