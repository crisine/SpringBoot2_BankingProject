package com.crisine.bankapp.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)      // 어노테이션 생성 위치 지정, 메소드의 파라미터로 선언된 객체에서만 사용가능.
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {       // 어노테이션 클래스로 지정, 이름은 LoginUser로
}
