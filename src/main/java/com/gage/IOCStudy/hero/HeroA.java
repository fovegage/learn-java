package com.gage.IOCStudy.hero;

import com.gage.IOCStudy.IC;

// 作用于类  进行配置
// 这个地方被注册到容器中  接着使用 autowired 进行调用
// 可以使用lazy进行延时注册到容器 即 当调用方被访问的时候在注入
//@Component   // 注意当使用条件注解的 时候 不能使用 @Component
//@Lazy
public class HeroA implements IC {

    // 实例方法
    public void q() {
        System.out.println("HeroA Q");
    }
}

