package com.example.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachName implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoachName(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWork() {
        
        return "Practice Action GetDAilyWorkName Tennish Coach";
    }

    @Override
    public String getFortuneService() {
        
        return fortuneService.getFortuneService();
    }
    
}
