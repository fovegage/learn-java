package com.gage.validators;



import com.gage.core.Enumeration.LoginType;
import com.gage.core.Enumeration.OperateType;
import com.gage.dto.UserDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// 校验器和  要校验的类型
public class PasswordValidator implements ConstraintValidator<PassWordEqual, UserDTO> {
    @Override
    public boolean isValid(UserDTO userDTO, ConstraintValidatorContext constraintValidatorContext) {
        String pw1 = userDTO.getPassword();
        String pw2 = userDTO.getRepeatPassword();
        LoginType loginType = userDTO.getLoginType();
        OperateType operateType = userDTO.getOperateType();
        if (operateType == OperateType.LOGIN) {
            return true;
        }
        if (loginType == LoginType.BASE) {
            return pw1.equals(pw2);
        }
        return true;

    }
}
