package com.example.IoC;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortuneService() {
        
        return "Today is your goodluck";
    }
    
}
