public class Car2 {
    private FactoryInter fac;
    public Car2(FactoryInter fac){
        this.fac = fac;
    }
    public void Reaction(){
        fac.runAction();
    }
}
