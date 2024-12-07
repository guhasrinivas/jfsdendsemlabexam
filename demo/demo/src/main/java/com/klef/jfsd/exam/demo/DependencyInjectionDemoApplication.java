package com.klef.jfsd.exam.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    @Autowired
    private Employee employee; // Constructor-based DI will inject this

    @Autowired
    private Course course; // Setter-based Autowiring will inject this

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        DependencyInjectionDemoApplication app = context.getBean(DependencyInjectionDemoApplication.class);

        // Demonstrate Constructor-based Dependency Injection (for Employee)
        System.out.println("Constructor Dependency Injection: ");
        System.out.println(app.employee);

        // Demonstrate Setter Autowiring (for Course)
        System.out.println("\nSetter Autowiring: ");
        System.out.println(app.course);
    }
}
