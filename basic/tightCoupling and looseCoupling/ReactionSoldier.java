
public class ReactionSoldier {
    public static void main(String[] args){
        GunInter shortGun = new ShortGun();
        Soldier2 s = new Soldier2(shortGun);
        s.action();

        GunInter thomsomGun = new ThomsomGun();
        Soldier2 s2 = new Soldier2(thomsomGun);
        s2.action();
    }
}
