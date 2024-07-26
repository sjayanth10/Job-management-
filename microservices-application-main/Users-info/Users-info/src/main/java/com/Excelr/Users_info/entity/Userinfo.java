package com.Excelr.Users_info.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "userinfo")
@Data

public class Userinfo {

    @Id
    public int id;

    public String name;

    public String username;

    public String email;

    public String phonenumber;

    public Date dob;

    public String experince;

    public String experience;

    public String domain;

    public String designation;

    public String company;

    public String address;

    public String city;

    public String state;

    public String country;

    public List<String> skills;

    public long jobid;


}
