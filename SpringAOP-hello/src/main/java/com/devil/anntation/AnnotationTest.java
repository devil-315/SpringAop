package com.devil.anntation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * ClassName：AnnotationTest
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
//@Component
////标注这是一个切面
//@Aspect
//public class AnnotationTest {
//    @Before("execution(* com.devil.service.impl.UserServiceImpl.*(..))")
//    public void before(){
//        System.out.println("方法之前");
//    }
//
//    @After("execution(* com.devil.service.impl.UserServiceImpl.*(..))")
//    public void after(){
//        System.out.println("方法之后");
//    }
//
//    @Around("execution(* com.devil.service.impl.UserServiceImpl.*(..))")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("环绕前");
//        //执行方法
//        Object proceed = joinPoint.proceed();
//        System.out.println("环绕后");
//    }
//
//    @AfterReturning("execution(* com.devil.service.impl.UserServiceImpl.*(..))")
//    public void returning(){
//        System.out.println("返回通知");
//    }
//
//    @AfterThrowing("execution(* com.devil.service.impl.UserServiceImpl.*(..))")
//    public void execption(){
//        System.out.println("异常通知");
//    }
//}
