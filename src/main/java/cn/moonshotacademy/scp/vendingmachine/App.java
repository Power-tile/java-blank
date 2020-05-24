package cn.moonshotacademy.scp.vendingmachine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.moonshotacademy.scp.vendingmachine.service.ProductService;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService ps = (ProductService)ac.getBean("ps");
        ps.testMethod();
    }
}
