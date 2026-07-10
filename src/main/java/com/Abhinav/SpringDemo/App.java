package com.Abhinav.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
       
        //Dependency Injection
        //1. Setter injection
//        Car car = (Car) ctx.getBean("car");
//        System.out.println("Car battery remainig: " + car.getBattery()+ "%");
        
        //2. Field injection
        Car car = (Car) ctx.getBean("car");
        car.getCarDetails();
    }
}
