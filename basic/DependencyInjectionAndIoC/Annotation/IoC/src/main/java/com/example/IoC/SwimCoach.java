package com.example.IoC;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWork() {
        // TODO Auto-generated method stub
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getFortuneService() {
        // TODO Auto-generated method stub
        return fortuneService.getFortuneService();
    }
    
}
