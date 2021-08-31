package com.fogus14.tutorial.lombok;

import lombok.*;

import java.util.Objects;

// 어노테이션은 중요도 순으로 작성해두는 것이 좋다! + 어노테이션은 최대한 붙여 써주는 것이 좋다!
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Setter(value = AccessLevel.NONE)
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private Team team;


    public Member(Long id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name + "(HI)";
    }



    //    @Override
//    public String toString() {
//        return "Member{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }

}
