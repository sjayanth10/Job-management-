package com.excelr.Jobs_info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "jobs")
public class Jobs {
    @Id
    public int jobid;

    public String jobtitle;

    public String jobdescription;

    public String joblocation;

    public String jobtype;

    public String jobcategory;

    public String jobstatus;

    public String jobstartdate;

    public String jobbenddate;

    public String jobcomapanyname;

    public String jobcomapanywebsite;

    public double salary;

    public int experience;


}
