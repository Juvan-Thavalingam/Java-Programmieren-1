public class Dozent extends Person{

    private String büroNummer;
    private String telefonNummer;

    public Dozent(String name, String id, String büroNummer, String telefonNummer){
        super(name, id);
        this.büroNummer = büroNummer;
        this.telefonNummer = telefonNummer;
    }

    public String gibBuero(){
        return büroNummer;
    }

    public String gibTelefonnummer(){
        return telefonNummer;
    }
}
