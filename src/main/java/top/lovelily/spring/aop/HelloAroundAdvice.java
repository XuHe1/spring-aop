package top.lovelily.spring.aop;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Desc: HelloAroundAdvice
 * Author: Xu He
 * created: 2021/6/30 11:32
 */

public class HelloAroundAdvice implements MethodInterceptor {
    public void hello(ProceedingJoinPoint joinPoint) {
        System.out.println("hello...");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("hello...");
        try {
            invocation.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
