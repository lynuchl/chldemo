/*
author:chaohl
date:2020/12/15
*/
package com.example.demo.utils.aop;

import eu.bitwalker.useragentutils.UserAgent;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Aspect
@Slf4j
@Component
public class SpringbootAop {

    /* @Author chaohl
     * @Description 切入点
     * @Date 16:25 2020/12/15
     * @Param []
     * @return void
     **/

//    @Pointcut("execution(public * com.example.demo.controller.*.*(..))")
    @Pointcut("execution(public * com.example.demo.config.SaticScheduleTask.*(..))")

//    @Pointcut("execution(public * *(..))")

    public void logForProgram(){}


    /* @Author chaohl
     * @Description
     * @Date 16:57 2020/12/15
     **/
    @Before("logForProgram()")

    public void beforeExePrintLog(JoinPoint joinPoint){
        String className=joinPoint.getTarget().getClass().getName();
        log.info("this is aop tongzhi log test!!!");
        log.info(className);

    }


    /* @Author chaohl
     * @Description
     * @Date 10:15 2020/12/16
     **/
//    @Around("logForProgram()")
//
//    public void aroundExePrintLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//
//        /*
//        获取请求对象
//         */
//       ServletRequestAttributes servletRequestAttributes= (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
//       HttpServletRequest httpServletRequest=Objects.requireNonNull(servletRequestAttributes).getRequest();
//
//       Long startTime= System.currentTimeMillis();
//       Object result=proceedingJoinPoint.proceed();
//       String herder= httpServletRequest.getHeader("User-Agent");
//       UserAgent userAgent= UserAgent.parseUserAgentString(herder);
//
//
//
//
//
//
//    }


}
