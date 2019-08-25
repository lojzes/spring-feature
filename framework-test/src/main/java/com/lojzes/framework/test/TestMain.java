package com.lojzes.framework.test;

import com.lojzes.framework.core.Student;
import com.lojzes.framework.test.config.SysConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2019/8/25 0025 21:21
 */
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext
                = new AnnotationConfigApplicationContext(SysConfig.class);
       // Student bean = configApplicationContext.getBean(Student.class);
        Student bean = (Student)configApplicationContext.getBean("st1");
        Student bean2 = (Student)configApplicationContext.getBean("st2");

        System.out.println("bean = " + bean);
        System.out.println("bean2= " + bean2);

    }
}
