public class Soldier2 {
    private GunInter gun;
    public Soldier2(GunInter gun){
        this.gun = gun;
    }
    public void action(){
        gun.fire();
    }
}
