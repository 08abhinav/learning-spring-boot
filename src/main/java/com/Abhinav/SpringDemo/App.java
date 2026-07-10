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
//        Car car = (Car) ctx.getBean("car");
//        car.getCarDetails();
        
        //3. Constructor injection
//        Car car = (Car) ctx.getBean("car");
//        car.getCarDetails();	
        
        //Bean Scope
        //1.Singleton Scope
        Car car = (Car) ctx.getBean("car");
        car.setBatter(99);
        car.getCarDetails();
        
        Car car2 = (Car) ctx.getBean("car");
        car2.setBatter(15);
        car2.getCarDetails();
        
        
      
    }
}
