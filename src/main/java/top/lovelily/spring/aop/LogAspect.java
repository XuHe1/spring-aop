package top.lovelily.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Desc: LogAspect
 * Author: Xu He
 * created: 2021/5/14 16:28
 */

public class LogAspect {
    public Object doAroundLog(ProceedingJoinPoint joinPoint) {
        System.out.println("begin...");
        try {
            Object result = joinPoint.proceed();

            // execution(void top.lovelily.spring.service.UserService.save(User))
            System.out.println(joinPoint);
            // top.lovelily.spring.service.impl.UserServiceImpl@3e3047e6
            System.out.println(joinPoint.getTarget());

            return result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("end...");
        return null;
    }
}
