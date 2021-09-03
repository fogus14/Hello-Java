package com.fogus14.tutorial.lombok.chaining;

import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Setter
public class Member {

    private Long id;
    private String name;
    private String phoneNumber;

}
