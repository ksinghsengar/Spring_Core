package main.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishan on 6/30/2017.
 */
public class DatabaseMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Database database = (Database) applicationContext.getBean("exercise1");
        System.out.println(database);
    }
}

