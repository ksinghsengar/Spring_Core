package main.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishan on 6/30/2017.
 */
public class ComplexMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("spring-config.xml");
        Complex complex = (Complex) applicationContext.getBean("complexbean");
        System.out.println(complex);

    }
}
