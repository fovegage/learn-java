package com.gage.dto;


import com.gage.core.Enumeration.LoginType;
import com.gage.core.Enumeration.OperateType;
import com.gage.validators.PassWordEqual;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@PassWordEqual
public class UserDTO {

    @NotBlank(message = "用户名不能为空")
    private String account;  // 统一 是邮箱或者手机号 后台判断

    @NotBlank(message = "密码不能为空")
    private String password;

    private String repeatPassword;

    @NotNull(message = "loginType不能为空")
    private LoginType loginType; // 渠道：微信 微博等

    @NotNull(message = "operateType不能为空")
    private OperateType operateType; // 类型：登录 注册等
}
