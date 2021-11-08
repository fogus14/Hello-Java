package com.fogus14.tutorial.reflectiontest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ForReflectionClassA {
    private String id;
    private String name;

    public ForReflectionClassA(String id) {
        this.id = id;
    }

}
