public class Künstler {

    public Künstler(String name, int gage){
        setzeKünstler(name, gage);
    }
    private String name;
    private int gage;

    public void setzeKünstler(String name, int gage){
        this.name = name;
        this.gage = gage;
    }

    public int getGage(){
        return gage;
    }

    public String getName(){
        return name;
    }
}
