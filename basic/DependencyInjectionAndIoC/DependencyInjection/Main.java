public class Main {
    
    public static void main(String[] args){
        Car car1 = new Car();
        car1.action();

        FactoryInter fac1 = new FactoryImp();
        FactoryInter fac2 = new ProduceImp();
        
        Car2 car2 = new Car2(fac1);
        Car2 car3 = new Car2(fac2);
        car2.Reaction();
        car3.Reaction();

    }
}
