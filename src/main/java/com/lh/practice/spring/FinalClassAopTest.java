package com.lh.practice.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author liuhui
 **/
public class FinalClassAopTest {

  public static void main() {
    ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
    // 注意，这里只能通过Human.class获取，而无法通过Student.class，因为在Spirng容器中，
    // 因为使用JDK动态代理，Ioc容器中，存储的是一个类型为Human的代理对象
    Human human = context.getBean(Human.class);
    human.display();
    // 输出代理类的父类，以此判断是JDK还是CGLib
    System.out.println(human.getClass().getSuperclass());
  }
}

@Configuration
@ComponentScan(basePackages = "com.lh.practice")
@EnableAspectJAutoProxy
class AOPConfig {}



interface Human {

  void display();
}

@Component
final class Student implements Human {

  @Override
  public void display() {
    System.out.println("I am a student");
  }
}

@Aspect
@Component
class HumanAspect {

  // 为Student这个类的所有方法，配置这个前置通知
  @Before("execution(* com.lh.practice.*(..))")
  public void before() {
    System.out.println("before student");
  }
}