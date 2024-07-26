package com.excelr.Jobs_info.Config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fullresponse {
    public int jobid;
    public String jobtitle;
    public String jobdescription;
    public String joblocation;
    public String jobtype;
    public String jobcategory;
    public double salary;
    public int experience;
    public List<Userinfo> userinfo;


}
