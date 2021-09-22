package com.yun.admin.entity;

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
@Table(name = "job_collection")
public class JobCollection implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_collection_id")
    private Integer jobCollectionId;

    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "job_id")
    private Integer jobId;

    @Column(name = "collect_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date collectTime;

    @Column(name = "status")
    private String status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}