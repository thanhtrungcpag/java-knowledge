

public class XeOto extends Xe implements Dichuyen{

    private String bienSo;
    // trong phạm vi nội bộ packet
    public XeOto(){
        super("Dongco");
        this.bienSo = "Bienso";
    }
    public XeOto(String bienSo, String dongCo){
        super(dongCo);
        this.bienSo = bienSo;
    }
    
    @Override
    void khoiDongCo() {
        System.out.println("xe: " + this.bienSo);

    }

    @Override
    void dungDongCo() {
        

    }
    @Override
    public void diChuyen() {
        System.out.println("xeoto will move too slowly");
    }
    @Override
	public int khoangCach(int x, int y) {
		
		return x - y;
	}
}


