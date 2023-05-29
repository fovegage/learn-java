package com.gage.base.study;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String value = "hello";
        Optional<String> optionalS = Optional.of(value);
        // isPresent 判断是否null
        optionalS.ifPresent(System.out::println);

        String defaultValue = optionalS.orElse("Default Value");
        System.out.println("Value or default: " + defaultValue);
    }
}
