package com.example.gojipserver.domain.checklist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CheckList {

    @Id @GeneratedValue
    @Column(name = "checklist_id")
    private Long id;

    private String address;

    //보증금
    private int deposit;

    

}
