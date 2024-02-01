package com.example.gojipserver.domain.checklist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Collection {

    @Id @GeneratedValue
    private Long id;

}
