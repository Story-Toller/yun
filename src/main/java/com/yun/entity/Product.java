package com.yun.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    private String proId;

    private String proName;

    private Long proNum;

    private Float proSize;


    private String proColor;

    private Float proPrice;

    private String proAddress;

    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date proDate;
}