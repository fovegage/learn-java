package com.gage.spring.IOCStudy;

import com.gage.spring.IOCStudy.hero.HeroB;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// spring boot 会自动的将其注入
// 使用配置类 可以进行对象的传参  而使用 autowired Component  注入使直接由spring进行注入的
@Configuration
public class HeroConfiguration {

    // 使用configuration 可以更加符合代码开闭原则
    // 只需要修改配置类即可
    @Value("${grpc.host}")
    private String ip;

    @Value("${grpc.java-user-port}")
    private Integer port;

    // 注入bean   具体的业务实体类
//    @Bean
//    public IC heroc() {
//        return new HeroC(this.ip, this.port);
//    }


    @Bean
//    @Conditional(HeroBCondition.class)  // 自定义
    // matchIfMissing =true 没有该属性的时候
    @ConditionalOnProperty(value = "grpc.python-port", havingValue = "7777" )   // 成品注解  从配置中读取

//    @ConditionalOnMissingBean(name = "mysql")  // 提交注入依赖的bean
    public IC herob() {
        return new HeroB();
    }  // 创建bean

}
