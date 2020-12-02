public class Soldier{
    Gun gun = new Gun();

    public void action(){
        gun.fire();
    }
    public static void main(String[] args){
        Soldier s1 = new Soldier();
        s1.action();
    }
}

