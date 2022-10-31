package com.company.creationalPatterns.builderFactory;

public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder().name("Ivan").age(33).build();
        User user1 = new User.UserBuilder()
                .name("Petya")
                .age(27)
                .gender("female")
                .address("Veliko Tarnovo")
                .email("petyaa@abv.bg")
                .build();

        System.out.println(user.getAddress());
        System.out.println(user.getAge());
        System.out.println(user1.getName());
        System.out.println(user1.getEmail());
    }
}
