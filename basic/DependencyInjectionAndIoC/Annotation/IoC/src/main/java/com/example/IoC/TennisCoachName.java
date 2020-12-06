package com.example.IoC;

import org.springframework.stereotype.Component;

@Component
public class TennisCoachName implements Coach {

    @Override
    public String getDailyWork() {
        
        return "Practice Action GetDAilyWorkName Tennish Coach";
    }
    
}
