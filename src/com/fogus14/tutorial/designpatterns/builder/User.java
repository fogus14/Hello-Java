package com.fogus14.tutorial.designpatterns.builder;

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String phoneNum;

    private Test test;

    private User() {

    }

    private User(Long id, String name, String email, String password, String phoneNum) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
    }

    private User(Long id, String name, String email, String password, String phoneNum, Test test) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.test = test;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String email;
        private String password;
        private String phoneNum;
        private Test test;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder phoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public Builder test(Test test) {
            this.test = test;
            return this;
        }

        public User build() {
            if (this.test == null) {
                return new User(this.id, this.name, this.email, this.password, this.phoneNum);
            }
            return new User(this.id, this.name, this.email, this.password, this.phoneNum, this.test);
        }


    }


    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public Test getTest() {
        return test;
    }
}
