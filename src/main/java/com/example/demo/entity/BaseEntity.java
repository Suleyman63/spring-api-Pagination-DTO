package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {

    private Date createDate;
    private String createdBy;
    private Date updateDate;
    private String updateBy;

}
