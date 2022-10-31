package com.company.creationalPatterns.builderFactory;

public class User {
    private String name;
    private int age;
    private String email;
    private String address;
    private String gender;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
        this.gender = builder.gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public static class UserBuilder {

        private String name;
        private int age;
        private String email;
        private String address;
        private String gender;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder gender(String gender){
            this.gender = gender;
            return this;
        }


        public User build(){
            return new User(this);
        }
    }
}
