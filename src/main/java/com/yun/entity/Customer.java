package com.yun.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_telno")
    private String custTelno;

    @Column(name = "cust_email")
    private String custEmail;

    @Column(name = "cust_password")
    private String custPassword;

    @Column(name = "cust_regist_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date custRegistTime;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}