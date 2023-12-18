public abstract class Konto {

    private String inhaber;
    private int kontostand = 0;
    private static final int MAX = 100000;

    protected int nummer = 1000;

    public Konto(String inhaber, int betrag){
        this.inhaber = inhaber;
        addBetrag(betrag);
    }

    protected void addBetrag(int betrag){
        if(this.kontostand + betrag <= MAX){
            this.kontostand += betrag;
        } else {
            this.kontostand = MAX;
        }
    }

    protected void removeBetrag(int betrag, int MinKontoStand){
        if(this.kontostand - betrag >= MinKontoStand){
            this.kontostand -= betrag;
        } else {
            this.kontostand = 0;
        }
    }

    public int getKontostand(){
        return kontostand;
    }
}
