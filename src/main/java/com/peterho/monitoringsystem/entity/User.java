package com.peterho.monitoringsystem.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //设置id自增
    private Integer id;
    private String username;
    private String password;
    private Integer usertype;

}
