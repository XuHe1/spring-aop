package top.lovelily.spring;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.Advised;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lovelily.spring.entity.User;
import top.lovelily.spring.service.UserService;
import top.lovelily.spring.service.impl.UserServiceImpl;

/**
 * Desc: TestAop
 * Author: Xu He
 * created: 2021/5/14 15:33
 */

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Object bean = context.getBean("userService");
        System.out.println(bean instanceof Advised);

        System.out.println(bean instanceof UserService);

        System.out.println(bean instanceof UserServiceImpl);

        UserService userService = (UserService) bean;

        User user = new User();
       // userService.save(user);
        User user1 = userService.get();
        System.out.println(user1);

    }
}
