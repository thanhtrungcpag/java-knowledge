package com.example.IoC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
        public static void main(String[] args){

            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

            // get the bean from spring container
            Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
            Coach theCoach2 = context.getBean("tennisCoachName", Coach.class);
            System.out.println(theCoach.getDailyWork());
            System.out.println(theCoach2.getDailyWork());
            System.out.println(theCoach2.getFortuneService());
            // close the context
            context.close();
        }
}
