package com.example.IoC;

public class SadFortuneService  implements FortuneService {

    @Override
    public String getFortuneService() {
        
        return "Today is sad work";
    }
    
}
