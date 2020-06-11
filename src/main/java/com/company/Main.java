package main.java.com.company;

import com.company.MyService;
import com.company.MySpringClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

/*
       MyService obj = (MyService) context.getBean("myService");
        obj.doJob();
*/
        MySpringClass mySpringClass = new MySpringClass();
        mySpringClass.setMyStraing("1234");

        MyService myService = new MyService();
        myService.setMySpringClass(mySpringClass);

     //  System.out.println("Hello World!");

    }
}