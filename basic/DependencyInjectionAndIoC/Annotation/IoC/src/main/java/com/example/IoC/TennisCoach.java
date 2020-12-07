package com.example.IoC;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWork() {
        
        return "Practice Action GetDAilyWork Tennish Coach";
    }

    @Override
    public String getFortuneService() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
