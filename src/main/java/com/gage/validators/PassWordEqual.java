package com.gage.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented  // 添加到文档
@Target({ElementType.TYPE})  // 作用在什么上 TYPE 作用在类和接口上
@Retention(RetentionPolicy.RUNTIME) // 运行异常
@Constraint(validatedBy = PasswordValidator.class) // 用哪个类校验
public @interface PassWordEqual {

    // 返回校验器的默认信息
    String message() default "两次输入的密码不相等，请核对";

    // 默认
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


}
