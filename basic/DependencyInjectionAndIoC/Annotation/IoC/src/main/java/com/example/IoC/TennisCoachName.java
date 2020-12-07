package com.example.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachName implements Coach {

    private FortuneService fortuneService;


    public TennisCoachName(){
        System.out.println("Created TennisCoachName");
    }

    // Setter Injection
    // @Autowired
    // public void setFortuneService(FortuneService fortuneService) {
    //     System.out.println("Setter Injection");
    //     this.fortuneService = fortuneService;
    // }
    
    // method Injection
    @Autowired
    public void doFortuneService(FortuneService fortuneService) {
        System.out.println("Method: do Injection");
        this.fortuneService = fortuneService;
    }

    // Constructor Injection
    // @Autowired
    // public TennisCoachName(FortuneService fortuneService){
    //     this.fortuneService = fortuneService;
    // }

    @Override
    public String getDailyWork() {
        
        return "Practice Action GetDAilyWorkName Tennish Coach";
    }

    @Override
    public String getFortuneService() {
        
        return fortuneService.getFortuneService();
    }
    
}
