public class NummernKonto extends Konto{

    public NummernKonto(String inhaber, int betrag, int nummer){
        super(inhaber, betrag);
        this.nummer = nummer;
    }

}
