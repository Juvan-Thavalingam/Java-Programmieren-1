public class Bankkonto {
    private String kontoInhaber;
    private int kontoStand;
    private int zinsSatz;

    public Bankkonto(String kontoInhaber){
        this.kontoInhaber = kontoInhaber;
        kontoStand = 0;
        zinsSatz = 0;
    }

    public Bankkonto(String kontoInhaber, int zinsSatz){
        this.kontoInhaber = kontoInhaber;
        this.zinsSatz = zinsSatz;
        kontoStand = 0;
    }

    public void setZinsSatz(int zinsSatz){
        this.zinsSatz = zinsSatz;
    }

    public int getZinsSatz(){
        return zinsSatz;
    }

    public void addBargain(int bargain){
        kontoStand += bargain;
    }

    public void removeBargain(int bargain){
        kontoStand-= bargain;
    }

    public int rechneJahresZins(){
        return kontoStand/100*zinsSatz;
    }

    public void print(){
        System.out.println("Informationen zum Konto:");
        System.out.println("Kontoinhaber: " + kontoInhaber);
        System.out.println("Kontostand: " + kontoStand);
        System.out.println("Zinssatz: " + zinsSatz + "\n");
    }

    public static void main(String[] args) {
        Bankkonto bank = new Bankkonto("Juvan");
        bank.setZinsSatz(2);
        bank.addBargain(2000);
        bank.rechneJahresZins();
        bank.print();

        Bankkonto bank1 = new Bankkonto("Pascal", 5);
        bank1.addBargain(5000);
        bank1.rechneJahresZins();
        bank1.print();

        bank1.removeBargain(2000);
        bank1.print();
    }
}
