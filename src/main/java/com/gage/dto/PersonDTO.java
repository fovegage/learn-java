package com.gage.dto;

import com.gage.validators.PassWordEqual;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor  // 有参构造
@NoArgsConstructor   //  无参构造
//@RequiredArgsConstructor // 仅仅为不为空的参数构造
@Builder
@PassWordEqual  // 自定义的校验器
public class PersonDTO {


    //    @NonNull
//    基础注解
//    @Length(min = 2, max = 10, message = "123456789test")
    private String name;
    private Integer id;

    private String pw1;
    private String pw2;

//    public PersonDTO(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }


}
