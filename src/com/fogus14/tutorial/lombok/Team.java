package com.fogus14.tutorial.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@ToString(exclude = {"members", "name"})
@ToString
@AllArgsConstructor
public class Team {

    private Long id;
    private String name;

    @ToString.Exclude
    private List<Member> members = new ArrayList<>();

    public Team(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}


