public abstract class Xe {
    // declare fields
    private String dongCo;

    // Constructor
    Xe(String dongCo){
        this.dongCo = dongCo;
    }

    // declare non-abstract method
    // it has default implementation
    public void moveTo(int x, int y){
        System.out.println(this.dongCo + " moveTo x: " + x + " y: " + y);
    }
    // abstract method which will
    // implement by its subclass(es)
    abstract void khoiDongCo();
    abstract void dungDongCo();
}