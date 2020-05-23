package cn.moonshotacademy.scp.vendingmachine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestClass testClass = (TestClass)ac.getBean("testClass");
        testClass.printMessage();
    }
}
