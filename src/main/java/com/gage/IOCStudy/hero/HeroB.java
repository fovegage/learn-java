package com.gage.IOCStudy.hero;

import com.gage.IOCStudy.IC;

//@Component
public class HeroB implements IC {

    public HeroB() {
        System.out.println("测试条件注解");
    }

    @Override
    public void q() {
        System.out.println("HeroB Q");
    }
}
