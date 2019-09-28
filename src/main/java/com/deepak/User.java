package com.deepak;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class User {
    private static String createUser(String name) {
        log.info("Creating user for you sir :)");
        return "Mr., " + name;
    }
    public static void main(String[] args) {
        System.out.println(createUser("Deepak"));
    }
}
