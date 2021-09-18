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
@Table(name = "company_admin")
public class CompanyReceiveResumeRecord implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_receive_resume_record_id")
    private Integer companyReceiveResumeRecordId;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "resume_id")
    private Integer resumeId;

    @Column(name = "receive_time")
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date receiveTime;

    @Column(name = "company_admin_id")
    private Integer companyAdminId;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}