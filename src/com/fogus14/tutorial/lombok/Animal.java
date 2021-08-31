package com.fogus14.tutorial.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Animal {

    private final Long id;
    private final String type;
    private String name;

//    public Animal(Long id, String type) {
//        this.id = id;
//        this.type = type;
//    }

}
