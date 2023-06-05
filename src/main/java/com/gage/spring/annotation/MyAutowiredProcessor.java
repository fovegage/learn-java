package com.gage.spring.annotation;

import java.lang.reflect.Field;

public class MyAutowiredProcessor {
    public static void process(Object target) {
        Class<?> clazz = target.getClass();
        System.out.println(clazz);
        for (Field filed : clazz.getDeclaredFields()) {
            System.out.println("field1--->" + filed);
            if (filed.isAnnotationPresent(MyAutowired.class)) {
                System.out.println("field2--->" + filed);
                filed.setAccessible(true);
                Class<?> filedType = filed.getType();
                try {
                    Object instance = filedType.getDeclaredConstructor().newInstance();
                    filed.set(target, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
