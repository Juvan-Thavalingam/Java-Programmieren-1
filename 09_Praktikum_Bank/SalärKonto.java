public class SalärKonto extends Konto{

    private static final int MIN = 0;
    private static final int MAX = 110000;

    public SalärKonto(String name, int betrag){
        super(name, betrag);
    }

    @Override
    protected void removeBetrag(int betrag, int MinKontoStand) {
        super.removeBetrag(betrag, MIN);
    }

}
