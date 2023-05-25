package com.gage.IOCStudy.hero;

import com.gage.IOCStudy.IC;

//  继承 IC 容器
public class HeroC implements IC {
    private String name;

    // 无参构造
    public HeroC() {
        System.out.println(this.name + ":" + this.age);
    }

    // 有参构造
    public HeroC(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    // setter / getter 修改获取属性

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    @Override
    public void q() {
        System.out.println("Heroc Q:"+this.name);
    }
}
