package org.example.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {

           var  context  = new  AnnotationConfigApplicationContext(Config.class);

             Auto auto1 = context.getBean("auto1", Auto.class);
             Auto auto2 = context.getBean("auto2", Auto.class);

             System.out.println(auto1);
             System.out.println(auto2);
        }

    }

