package com.gage.base.InterfaceExample;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer接口常用于需要对某个对象执行一些操作，而不需要返回结果的场景。
        // 可以将Consumer作为参数传递给其他方法，以便在方法内部对传入的对象进行处理。
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
        //  fruit -> System.out.println(fruit)
        Consumer<String> consumer = System.out::println;
        fruits.forEach(consumer);

        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String o) {
                System.out.println(o.toUpperCase(Locale.ROOT));
            }
        };
        fruits.forEach(consumer1);
    }
}
