package com.gage.spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class circle {
    public class A {
        private B b;

        public A(B b) {
            this.b = b;
        }
    }

    public class B {
        private A a;

        public B(A a) {
            this.a = a;
        }
    }

    @Configuration
    public class AppConfig {
        @Bean
        public A a(B b) {
            return new A(b);
        }

        @Bean
        public B b(A a) {
            return new B(a);
        }
    }

    public static void main(String[] args) {
        // 循环依赖
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        A a = context.getBean(A.class);
        B b = context.getBean(B.class);
    }
}
