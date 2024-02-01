package com.example.gojipserver.domain.checklist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Address {

    @Id @GeneratedValue
    private Long id;

}
