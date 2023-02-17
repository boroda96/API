package ru.netology.api;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7-(999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.years = 1999;

        System.out.println(post.name);
        System.out.println(post.passport);
        System.out.println(post.patronymic);
        System.out.println(post.phone);
        System.out.println(post.surname);
        System.out.println(post.subscription);
        System.out.println(post.birthday.day);
        System.out.println(post.birthday.month);
        System.out.println(post.birthday.years);


    }
}