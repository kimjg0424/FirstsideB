package com.example.firstside.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class BookDTO {

    @GeneratedValue @Id
    private long Id;


    private String name;

    private Date createBy;

    private Date updateBy;

    private String status;

    private String Category;

}
