package com.screamgarage.cognizantchallenge.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "challenge")
@Data
@RequiredArgsConstructor
public class Challenge {
    @Id
    private String id;
    private final String name;
    private final String exercise;
}
