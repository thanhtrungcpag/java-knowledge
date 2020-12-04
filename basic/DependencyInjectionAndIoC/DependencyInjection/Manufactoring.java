public class Manufactoring {
    private String name;

    public Manufactoring(){
        this.name = "NoName";
    }

    public Manufactoring(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void runAction(){
        System.out.println("Run Action");
    }
}
