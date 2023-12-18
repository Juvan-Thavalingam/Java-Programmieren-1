public class Student extends Person{

    private int creditsAnzahl;

    public Student(String name, String id){
        super(name, id);
    }

    public void erhoeheCredits(int nummer){
        creditsAnzahl += nummer;
    }

    public int gibCredits(){
        return creditsAnzahl;
    }
}
